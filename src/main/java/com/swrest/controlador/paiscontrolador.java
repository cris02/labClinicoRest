
package com.swrest.controlador;

import com.swrest.model.SclPais;
import com.swrest.servicio.paisserv;
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
@RequestMapping("/pais")
public class paiscontrolador
{
    @Autowired
    private paisserv paisservicio;
    
    @GetMapping("/all")
    public List<SclPais> listar()
    { return paisservicio.listar(); }
    
    @PostMapping
    public SclPais insertar(@RequestBody SclPais usu)
    { return paisservicio.insertar(usu); }
    
    @PutMapping
    public SclPais actualizar(@RequestBody SclPais a_obj)
    { return paisservicio.actualizar(a_obj); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclPais a_obj)
    { paisservicio.eliminar(a_obj); }
    
}
