package com.swrest.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclOpcionmenu;
import com.swrest.repositorio.OpcionMenuRepository;

@Service
public class opcionmenuserv
{
    @Autowired
    private OpcionMenuRepository paisrepositorio;
    
    public SclOpcionmenu insertar(SclOpcionmenu a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclOpcionmenu actualizar(SclOpcionmenu a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclOpcionmenu> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclOpcionmenu a_obj)
    { paisrepositorio.delete(a_obj); }
}

