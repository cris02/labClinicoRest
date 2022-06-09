package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclOrdendeexamen;
import com.swrest.model.SclPaciente;
import com.swrest.model.VExamenes;
import com.swrest.repositorio.ExamenRepositoty;
import com.swrest.repositorio.OrdenDeExamenRepository;
import com.swrest.repositorio.PacienteRepository;
import com.swrest.request.ExamenResponse;

@Service
public class ordendeexamenserv
{
    @Autowired
    private OrdenDeExamenRepository repositorio;
    @Autowired
    private PacienteRepository pacienterepo;
    
    @Autowired
    private ExamenRepositoty examenRepo;
    

    public List<SclOrdendeexamen> listar()
    { return repositorio.findAll(); }
    
    public SclOrdendeexamen listarId(Integer id)
    { return repositorio.findById(id).orElse(null); }
    
    public List<SclOrdendeexamen> listarOrdenPaciente(Integer id)
    { return repositorio.findByIdPaciente(pacienterepo.findById(id).orElse(null)); }
    
    public SclOrdendeexamen insertar(SclOrdendeexamen a_obj)
    { return repositorio.save(a_obj); }
    
    public SclOrdendeexamen actualizar(SclOrdendeexamen a_obj)
    { return repositorio.save(a_obj); }
    
    public void eliminar(SclOrdendeexamen a_obj)
    { repositorio.delete(a_obj); }
    
    //listar ordenes
    public List<VExamenes> listarExamenes(Integer id) {
    	return examenRepo.getExamenesPac(id);
    }
  
}

