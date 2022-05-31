package com.swrest.servicio;

import com.swrest.model.SclDepartamento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.DepartamentoRepository;

@Service
public class departamentoserv
{
    @Autowired
    private DepartamentoRepository paisrepositorio;
    
    public SclDepartamento insertar(SclDepartamento a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclDepartamento actualizar(SclDepartamento a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclDepartamento> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclDepartamento a_obj)
    { paisrepositorio.delete(a_obj); }
}

