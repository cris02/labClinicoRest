package com.swrest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclUsuario;
import com.swrest.repositorio.ClinicaRepository;
import com.swrest.repositorio.UsuarioRepository;


@Service
public class usuarioserv
{
    @Autowired
    private UsuarioRepository usuariorepositorio;
    @Autowired
    private ClinicaRepository clinicarepo;
    
    
    public List<SclUsuario> listar()
    { return usuariorepositorio.findAll(); }
    
    
    public SclUsuario listarId(Integer id) {
    	return usuariorepositorio.findById(id).orElse(null);
    }

    
    public SclUsuario listarCorreo(String email) {
    	return usuariorepositorio.findByCorreo(email);
    }
    
    
    public SclUsuario insertar(SclUsuario usu) {
    	String correo = usu.getCorreo();
    	usu.setCorreo(correo.toLowerCase()); //pasa correo a solo minusculas
    	if(usuariorepositorio.findByCorreo(usu.getCorreo()) == null) {
    		//String encodedPass = seguridad.encriptarClave(usu.getClave());
        	//usu.setClave(encodedPass);
        	usu.setIdClinica(clinicarepo.findById(usu.getIdClinica().getIdClinica()).get());
        	usu.setSclRolList(null);
        	usu.setSclAreadelaboratorioList(null);
        	usu.setSclExamencoprologiaList(null);
        	usu.setSclExamenhematologiaList(null);
        	usu.setSclExamenquimicaclinicaList(null);
        	usu.setSclExamenurianalisisList(null);
        	
        	return usuariorepositorio.save(usu);
    	}
    	else return null;
    }
    
    
    public SclUsuario actualizar(SclUsuario usu) { 	
    	//verifica si el id existe
    	if(usuariorepositorio.existsById(usu.getIdUsuario())) {
    		//String encodedPass = seguridad.encriptarClave(usu.getClave());
        	//usu.setClave(encodedPass);
        	
    		return usuariorepositorio.save(usu);
    	}
    	else return null;
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

}

