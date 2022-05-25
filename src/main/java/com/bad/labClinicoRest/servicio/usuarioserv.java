package com.bad.labClinicoRest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bad.labClinicoRest.model.SclUsuario;
import com.bad.labClinicoRest.repositorio.UsuarioRepository;

@Service
public class usuarioserv
{
    @Autowired
    private UsuarioRepository usuariorepositorio;
    
    public SclUsuario insertar(SclUsuario usu)
    { return usuariorepositorio.save(usu); }
    
    public SclUsuario actualizar(SclUsuario usu)
    { return usuariorepositorio.save(usu); }
    
    public List<SclUsuario> listar()
    { return usuariorepositorio.findAll(); }
    
    public void eliminar(SclUsuario usu)
    { usuariorepositorio.delete(usu); }
}

