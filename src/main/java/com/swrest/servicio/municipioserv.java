package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclMunicipio;
import com.swrest.model.SclMunicipioPK;
import com.swrest.repositorio.MunicipioRepository;


@Service
public class municipioserv
{
    @Autowired
    private MunicipioRepository repo;
    
    public List<SclMunicipio> listar()
    { return repo.findAll(); }
    
    public SclMunicipio listarId(SclMunicipioPK pk)
    { return repo.findById(pk).orElse(null); }
    
    public SclMunicipio insertar(SclMunicipio muni)
    { return repo.save(muni); }
    
    public SclMunicipio actualizar(SclMunicipio muni)
    { return repo.save(muni); }
    
    public void eliminar(SclMunicipio muni)
    { repo.delete(muni); }

}

