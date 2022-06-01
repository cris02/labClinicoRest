package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclRol;
import com.swrest.repositorio.RolRepository;

@Service
public class rolserv
{
    @Autowired
    private RolRepository paisrepositorio;
    
    public SclRol insertar(SclRol a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclRol actualizar(SclRol a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclRol> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclRol a_obj)
    { paisrepositorio.delete(a_obj); }
}

