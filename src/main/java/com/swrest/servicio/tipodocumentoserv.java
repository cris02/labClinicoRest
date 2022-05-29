/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swrest.servicio;

import com.swrest.model.SclTipoDocumento;
import com.swrest.repositorio.TipoDocumentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexa
 */
@Service
public class tipodocumentoserv
{
    @Autowired
    private TipoDocumentoRepository tipodocumentopositorio;
    
    public SclTipoDocumento insertar(SclTipoDocumento obj)
    { return tipodocumentopositorio.save(obj); }
    
    public SclTipoDocumento actualizar(SclTipoDocumento obj)
    { return tipodocumentopositorio.save(obj); }
    
    public List<SclTipoDocumento> listar()
    { return tipodocumentopositorio.findAll(); }
    
    public void eliminar(SclTipoDocumento obj)
    { tipodocumentopositorio.delete(obj); }
}
