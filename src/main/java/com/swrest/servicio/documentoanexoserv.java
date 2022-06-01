package com.swrest.servicio;

//import com.swrest.model.SclDocumentoAnexoPK;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclDocumentoAnexo;
import com.swrest.repositorio.DocumentoAnexoRepository;

@Service
public class documentoanexoserv
{
    @Autowired
    private DocumentoAnexoRepository paisrepositorio;
    
    public SclDocumentoAnexo insertar(SclDocumentoAnexo a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public SclDocumentoAnexo actualizar(SclDocumentoAnexo a_obj)
    { return paisrepositorio.save(a_obj); }
    
    public List<SclDocumentoAnexo> listar()
    { return paisrepositorio.findAll(); }
    
    public void eliminar(SclDocumentoAnexo a_obj)
    { paisrepositorio.delete(a_obj); }
}

