package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclPaciente;
import com.swrest.repositorio.PacienteRepository;

@Service
public class pacienteserv
{
    @Autowired
    private PacienteRepository pacienterepositorio;
    
    public SclPaciente insertar(SclPaciente pac)
    {	return pacienterepositorio.save(pac);	}
    
    public SclPaciente actualizar(SclPaciente pac)
    { 
    	if(pacienterepositorio.existsById(pac.getIdPaciente()))
    		return pacienterepositorio.save(pac);
    	else
    		return null;
    }
    
    public List<SclPaciente> listar()
    { return pacienterepositorio.findAll(); }
    
    public void eliminar(SclPaciente pac)
    { 
    	if(pacienterepositorio.existsById(pac.getIdPaciente()))
    		pacienterepositorio.delete(pac);
    }
}

