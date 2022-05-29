package com.swrest.servicio;

import com.swrest.model.SclTipoContacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.TipoContactoRepository;

@Service
public class tipocontactoserv
{
    @Autowired
    private TipoContactoRepository paisrepositorio;
    
    public SclTipoContacto insertar(SclTipoContacto a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclTipoContacto actualizar(SclTipoContacto a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclTipoContacto> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclTipoContacto a_obj)
    { paisrepositorio.delete(a_obj); }
}

