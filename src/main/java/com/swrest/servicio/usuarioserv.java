package com.swrest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.swrest.model.SclUsuario;
import com.swrest.repositorio.UsuarioRepository;


@Service
public class usuarioserv
{
    @Autowired
    private UsuarioRepository usuariorepositorio;
    @Autowired
    private securityserv seguridad;
    
    
    public List<SclUsuario> listar()
    { return usuariorepositorio.findAll(); }
    
    
    public SclUsuario insertar(SclUsuario usu) {
    	String encodedPass = seguridad.encriptarClave(usu.getClave());
    	usu.setClave(encodedPass);
    	
    	return usuariorepositorio.save(usu);
    }
    
    
    public SclUsuario actualizar(SclUsuario usu) { 	
    	//verifica si el id existe
    	if(usuariorepositorio.existsById(usu.getIdUsuario())) {
    		String encodedPass = seguridad.encriptarClave(usu.getClave());
        	usu.setClave(encodedPass);
        	
    		return usuariorepositorio.save(usu);
    	}
    	else return null;
    }
    
	public SclUsuario darDeBaja(Integer id) 
	{
		if(usuariorepositorio.existsById(id)) {
			SclUsuario user = usuariorepositorio.findById(id).get();
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
    
}

