package com.swrest.servicio;

import com.swrest.model.SclUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.UsuarioRepository;

@Service
public class usuarioserv
{
    @Autowired
    private UsuarioRepository usuariorepositorio;
    
    //Guarda y actualiza
    public SclUsuario insertar(SclUsuario usu)
    { return usuariorepositorio.save(usu); }
    
    //public SclUsuario actualizar(SclUsuario usu)
    //{ return usuariorepositorio.save(usu); }
    
    public List<SclUsuario> listar()
    { return usuariorepositorio.findAll(); }
    
	public SclUsuario darDeBaja(String id) {
    	SclUsuario user = usuariorepositorio.findById(id).get();
    	if(user.getActivo() == true)
    		user.setActivo(false);
    	else
    		user.setActivo(true);
    	
    	usuariorepositorio.save(user);
    	
    	return user;
    }
    
    public void eliminar(SclUsuario usu)
    { usuariorepositorio.delete(usu); }
}

