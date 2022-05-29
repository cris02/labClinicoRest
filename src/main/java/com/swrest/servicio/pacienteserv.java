package com.swrest.servicio;

import com.swrest.model.SclPaciente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.PacienteRepository;

@Service
public class pacienteserv
{
    @Autowired
    private PacienteRepository paisrepositorio;
    
    public SclPaciente insertar(SclPaciente a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclPaciente actualizar(SclPaciente a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclPaciente> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclPaciente a_obj)
    { paisrepositorio.delete(a_obj); }
}

