package com.swrest.servicio;

import com.swrest.model.SclClasificacionAnexo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.ClasificacionAnexoRepository;

@Service
public class clasificacionanexoserv
{
    @Autowired
    private ClasificacionAnexoRepository paisrepositorio;
    
    public SclClasificacionAnexo insertar(SclClasificacionAnexo a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclClasificacionAnexo actualizar(SclClasificacionAnexo a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclClasificacionAnexo> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclClasificacionAnexo a_obj)
    { paisrepositorio.delete(a_obj); }
}

