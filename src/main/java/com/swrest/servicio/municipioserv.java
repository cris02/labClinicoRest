package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclMunicipio;
import com.swrest.repositorio.MunicipioRepository;


@Service
public class municipioserv
{
    @Autowired
    private MunicipioRepository repo;
    
    
    public List<SclMunicipio> listar()
    { return repo.findAll(); }

}

