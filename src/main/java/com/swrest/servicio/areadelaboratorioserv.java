package com.swrest.servicio;

import com.swrest.model.SclAreadelaboratorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swrest.repositorio.AreaDeLaboratorioRepository;

@Service
public class areadelaboratorioserv
{
    @Autowired
    private AreaDeLaboratorioRepository areadelaboratoriorepositorio;
    
    public SclAreadelaboratorio insertar(SclAreadelaboratorio a_obj)
    { return areadelaboratoriorepositorio.save(a_obj); }
    
    public SclAreadelaboratorio actualizar(SclAreadelaboratorio a_obj)
    { return areadelaboratoriorepositorio.save(a_obj); }
    
    public List<SclAreadelaboratorio> listar()
    { return areadelaboratoriorepositorio.findAll(); }
    
    public void eliminar(SclAreadelaboratorio a_obj)
    { areadelaboratoriorepositorio.delete(a_obj); }
}

