
package com.swrest.controlador;

import com.swrest.model.SclContacto;
import com.swrest.model.SclContactoPK;
import com.swrest.servicio.contactoserv;
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
@RequestMapping("/contacto")
public class contactocontrolador
{
    @Autowired
    private contactoserv objservicio;
    
    @GetMapping
    public List<SclContacto> listar()
    { return objservicio.listar(); }
    
    @PostMapping
    public SclContacto insertar(@RequestBody SclContacto usu)
    { return objservicio.insertar(usu); }
    
    @PutMapping
    public SclContacto actualizar(@RequestBody SclContacto usu)
    { return objservicio.actualizar(usu); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclContacto usu)
    { objservicio.eliminar(usu); }
    
}
