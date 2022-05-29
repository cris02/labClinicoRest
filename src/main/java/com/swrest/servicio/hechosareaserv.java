package com.swrest.servicio;

import com.swrest.model.SclHechosArea;
//import com.swrest.model.SclHechosAreaPK;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.HechosAreaRepository;

@Service
public class hechosareaserv
{
    @Autowired
    private HechosAreaRepository paisrepositorio;
    
    public SclHechosArea insertar(SclHechosArea a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclHechosArea actualizar(SclHechosArea a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclHechosArea> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclHechosArea a_obj)
    { paisrepositorio.delete(a_obj); }
}

