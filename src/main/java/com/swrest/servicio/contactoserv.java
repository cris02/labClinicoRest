package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclContacto;
import com.swrest.repositorio.ContactoRepository;

@Service
public class contactoserv
{
    @Autowired
    private ContactoRepository paisrepositorio;
    
    public SclContacto insertar(SclContacto a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclContacto actualizar(SclContacto a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclContacto> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclContacto a_obj)
    { paisrepositorio.delete(a_obj); }
}

