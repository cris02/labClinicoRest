
package com.swrest.controlador;

import com.swrest.model.SclRol;
import com.swrest.servicio.rolserv;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rol")
public class rolcontrolador
{
    @Autowired
    private rolserv objservicio;
    
    @GetMapping
    public List<SclRol> listar()
    { return objservicio.listar(); }
    
    @PostMapping
    public SclRol insertar(@RequestBody SclRol usu)
    { return objservicio.insertar(usu); }
    
    @PutMapping
    public SclRol actualizar(@RequestBody SclRol usu)
    { return objservicio.actualizar(usu); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclRol usu)
    { objservicio.eliminar(usu); }
    
}
