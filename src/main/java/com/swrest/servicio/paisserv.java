package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclPais;
import com.swrest.repositorio.PaisRepository;

@Service
public class paisserv
{
    @Autowired
    private PaisRepository paisrepositorio;
    
    public SclPais insertar(SclPais a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclPais actualizar(SclPais a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclPais> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclPais a_obj)
    { paisrepositorio.delete(a_obj); }
}

