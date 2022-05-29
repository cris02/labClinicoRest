package com.swrest.servicio;

import com.swrest.model.SclExamenurianalisis;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.ExamenUrianalisisRepository;

@Service
public class examenurianalisisserv
{
    @Autowired
    private ExamenUrianalisisRepository paisrepositorio;
    
    public SclExamenurianalisis insertar(SclExamenurianalisis a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclExamenurianalisis actualizar(SclExamenurianalisis a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclExamenurianalisis> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclExamenurianalisis a_obj)
    { paisrepositorio.delete(a_obj); }
}

