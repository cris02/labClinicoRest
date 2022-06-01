package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclOrdendeexamen;
import com.swrest.repositorio.OrdenDeExamenRepository;

@Service
public class ordendeexamenserv
{
    @Autowired
    private OrdenDeExamenRepository paisrepositorio;
    
    public SclOrdendeexamen insertar(SclOrdendeexamen a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclOrdendeexamen actualizar(SclOrdendeexamen a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclOrdendeexamen> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclOrdendeexamen a_obj)
    { paisrepositorio.delete(a_obj); }
}

