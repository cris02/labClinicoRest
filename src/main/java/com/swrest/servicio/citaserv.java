package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclCita;
import com.swrest.repositorio.CitaRepository;

@Service
public class citaserv
{
    @Autowired
    private CitaRepository paisrepositorio;
    
    public SclCita insertar(SclCita a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclCita actualizar(SclCita a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclCita> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclCita a_obj)
    { paisrepositorio.delete(a_obj); }
}

