package com.swrest.servicio;

import com.swrest.model.SclHechoSangre;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.HechosSangreRepository;

@Service
public class hechossangreserv
{
    @Autowired
    private HechosSangreRepository paisrepositorio;
    
    public SclHechoSangre insertar(SclHechoSangre a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclHechoSangre actualizar(SclHechoSangre a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclHechoSangre> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclHechoSangre a_obj)
    { paisrepositorio.delete(a_obj); }
}

