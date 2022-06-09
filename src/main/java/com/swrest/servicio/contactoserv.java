package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclContacto;
import com.swrest.model.SclContactoPK;
import com.swrest.repositorio.ContactoRepository;

@Service
public class contactoserv
{
    @Autowired
    private ContactoRepository repositorio;
    
    public List<SclContacto> listar()
    { return repositorio.findAll(); }
    
    public SclContacto listarId(SclContactoPK pk)
    { return repositorio.findById(pk).orElse(null); }
    
    public SclContacto insertar(SclContacto a_obj)
    { return repositorio.save(a_obj); }
    
    public SclContacto actualizar(SclContacto a_obj)
    { return repositorio.save(a_obj); }
    
    public void eliminar(SclContacto a_obj)
    { repositorio.delete(a_obj); }
}

