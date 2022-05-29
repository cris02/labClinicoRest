package com.swrest.servicio;

import com.swrest.model.SclOpcionMenu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.OpcionMenuRepository;

@Service
public class opcionmenuserv
{
    @Autowired
    private OpcionMenuRepository paisrepositorio;
    
    public SclOpcionMenu insertar(SclOpcionMenu a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclOpcionMenu actualizar(SclOpcionMenu a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclOpcionMenu> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclOpcionMenu a_obj)
    { paisrepositorio.delete(a_obj); }
}

