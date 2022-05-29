package com.swrest.servicio;

import com.swrest.model.SclInfoprofecional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.InfoProfecionalRepository;

@Service
public class infoprofecionalserv
{
    @Autowired
    private InfoProfecionalRepository paisrepositorio;
    
    public SclInfoprofecional insertar(SclInfoprofecional a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclInfoprofecional actualizar(SclInfoprofecional a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclInfoprofecional> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclInfoprofecional a_obj)
    { paisrepositorio.delete(a_obj); }
}

