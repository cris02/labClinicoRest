package com.swrest.servicio;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.swrest.model.SclUsuario;
import com.swrest.repositorio.UsuarioRepository;

import net.bytebuddy.utility.RandomString;

@Service
public class usuarioserv
{
    @Autowired
    private UsuarioRepository usuariorepositorio;
    @Autowired
    private JavaMailSender mailsender;
    
    
    public List<SclUsuario> listar()
    { return usuariorepositorio.findAll(); }
    
    
    public SclUsuario insertar(SclUsuario usu) {
    	return usuariorepositorio.save(this.encriptar(usu));
    }
    
    
	//encriptador de contraseña
	public SclUsuario encriptar(SclUsuario usu) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPass = encoder.encode(usu.getClave());
		usu.setClave(encodedPass);
		
		return usu;
	}
	
    
    public SclUsuario actualizar(SclUsuario usu) { 	
    	//verifica si el id existe
    	if(usuariorepositorio.existsById(usu.getIdUsuario())) {
    		return usuariorepositorio.save(this.encriptar(usu));
    	}
    	else return null;
    }
    
    
	public SclUsuario darDeBaja(SclUsuario usu) 
	{
		if(usuariorepositorio.existsById(usu.getIdUsuario())) {
			SclUsuario user = usuariorepositorio.findById(usu.getIdUsuario()).get();
	    	if(user.getActivo() == true)
	    		user.setActivo(false);
	    	else
	    		user.setActivo(true);
	    	
	    	usuariorepositorio.save(user);
	    	
	    	return user;
		} else return null;
    }

    public void eliminar(SclUsuario usu)
    {
    	try {
    		if(usuariorepositorio.existsById(usu.getIdUsuario()))
        		usuariorepositorio.deleteById(usu.getIdUsuario()); 
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    //Genera la clave aleatoria
    public SclUsuario generarClave(Integer id) {
    	if(usuariorepositorio.existsById(id)) {
			SclUsuario user = usuariorepositorio.findById(id).get();
			String otp = RandomString.make(8);
			user.setClave(otp);
			usuariorepositorio.save(this.encriptar(user));
			
			try {
				this.recuperarClave(user, otp);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
			
			return user;
    	}
    	else return null;
    }
    
    //Envia correo de recuperacion
    public void recuperarClave(SclUsuario user, String otp) throws UnsupportedEncodingException, MessagingException {
    	
    	if(usuariorepositorio.existsById(user.getIdUsuario())) {
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
}

