package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclDepartamento;
import com.swrest.repositorio.DepartamentoRepository;

@Service
public class departamentoserv
{
    @Autowired
    private DepartamentoRepository repo;
    
    public SclDepartamento insertar(SclDepartamento d)
    { return repo.save(d); }
    
    public SclDepartamento actualizar(SclDepartamento d)
    { return repo.save(d); }
    
    public List<SclDepartamento> listar()
    { return repo.findAll(); }
    
    public void eliminar(SclDepartamento d)
    { repo.delete(d); }
}

