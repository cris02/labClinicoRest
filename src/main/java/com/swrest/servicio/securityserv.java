package com.swrest.servicio;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.swrest.model.SclUsuario;
import com.swrest.repositorio.UsuarioRepository;

import net.bytebuddy.utility.RandomString;

@Service
public class securityserv {
	
	@Autowired
    private UsuarioRepository usuariorepositorio;
    @Autowired
    private JavaMailSender mailsender;
    //correo del administrador
    private final String correoadmin = "mr14015@ues.edu.sv";
    
    
	/*/Encriptador de contraseña
	public String encriptarClave(String clave) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPass = encoder.encode(clave);
		
		return encodedPass;
	}*/
    
    public SclUsuario darDeBaja(Integer id) {
		if(usuariorepositorio.existsById(id)) {
			SclUsuario user = usuariorepositorio.findById(id).get();
	    	if(user.getActivo() == true)
	    		user.setActivo(false);
	    	else
	    		user.setActivo(true);
	    	
	    	usuariorepositorio.save(user);
	    	
	    	return user;
		} 
		else return null;
    }
    
    public String cambioClave(String email, String claveActual, String claveNueva) {
    	SclUsuario user = usuariorepositorio.findByCorreo(email.toLowerCase());
    	if(user != null) {
    		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    		if(claveActual == user.getClave()) {
    			user.setClave(claveNueva);
    			
    			usuariorepositorio.save(user);
    			
    			return "Se cambio la clave.";
    		}
    		else return "Clave incorrecta.";
    	}
    	else return "El usuario no existe.";
    }

    
    //Genera la clave aleatoria
      public String generarClave(Integer id) {
      	if(usuariorepositorio.existsById(id)) {
  			SclUsuario user = usuariorepositorio.findById(id).get();
  			String otp = RandomString.make(8);
  			//String encodedPass = this.encriptarClave(otp);
  			user.setClave(otp);
  			usuariorepositorio.save(user);
  			
  			//envia correo de recuperacion
  			try {	this.recuperarClave(user, otp);		} 
  			catch (UnsupportedEncodingException e) {	e.printStackTrace();	} 
  			catch (MessagingException e) {	e.printStackTrace();	}
  			
  			return "Se envio correo de recuperacion.";
      	}
      	else return "El usuario no existe.";
      }
      
      
       public String solicitarReinicio(String email) {
      	 SclUsuario user = usuariorepositorio.findByCorreo(email.toLowerCase());
      	 if(user != null) {
      		 try {	this.notificar(user);	} 
        		 catch (UnsupportedEncodingException e) {	e.printStackTrace();	} 
        		 catch (MessagingException e) {	e.printStackTrace();  }
        		 return "Notificacion enviada.";	
        	 }
        	 else return "No existe el usuario.";
        }
        
       //Notifica al administrador
       public void notificar(SclUsuario user) throws UnsupportedEncodingException, MessagingException {
      	 MimeMessage notificacion = mailsender.createMimeMessage();
     		 MimeMessageHelper helper = new MimeMessageHelper(notificacion);
         	 helper.setFrom("mr14015@clases.edu.sv","Laboratorio Clínico");
         	 helper.setTo(correoadmin);
         	 helper.setSubject("Solicitud de recuperación de clave");
         	 helper.setText("<p>El usuario <b>" + user.getNombre() + " " + user.getApellido() +
          			"</b> con direccion de correo: <b>" + user.getCorreo() +
          			"</b> ha solicitado un reinicio de clave de acceso.</p><br>" +
          			" <a href = http://localhost:8080/sec/send?id=" + user.getIdUsuario() + ">"
          			+ "Haga click a este enlace para permitir la recuperacion."
          			+ "</a href>", true);
          	
         	 mailsender.send(notificacion);
       }
      
      //Envia correo de recuperacion
      public void recuperarClave(SclUsuario user, String otp) throws UnsupportedEncodingException, MessagingException {
      	MimeMessage mensaje = mailsender.createMimeMessage();
  		MimeMessageHelper helper = new MimeMessageHelper(mensaje);
      	helper.setFrom("mr14015@clases.edu.sv","Laboratorio Clínico");
      	helper.setTo(user.getCorreo());
      	helper.setSubject("Recuperación de clave de acceso");
      	helper.setText("<p>Usted ha solicitado recuperación de clave de acceso.<br>" +
      	"Su nueva clave de acceso es: <b>"+ otp +"</b></p>", true);
      	
      	mailsender.send(mensaje);
      }
    
}
