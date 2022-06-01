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
    
    public SclUsuario insertar(SclUsuario usu)
    { return usuariorepositorio.save(usu); }
    
    public SclUsuario actualizar(SclUsuario usu)
    { 	//verifica si el id existe
    	if(usuariorepositorio.existsById(usu.getIdUsuario()))
    		return usuariorepositorio.save(usu);
    	else
    		return null;
    }
    
    public List<SclUsuario> listar()
    { return usuariorepositorio.findAll(); }
    
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
		} else 
			return null;
    }
    
    public void eliminar(SclUsuario usu)
    {
    	try {
    		if(usuariorepositorio.existsById(usu.getIdUsuario()))
        		usuariorepositorio.deleteById(usu.getIdUsuario()); 
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}

