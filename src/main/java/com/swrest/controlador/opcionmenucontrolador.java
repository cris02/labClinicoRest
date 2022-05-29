
package com.swrest.controlador;

import com.swrest.model.SclOpcionMenu;
import com.swrest.servicio.opcionmenuserv;
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
@RequestMapping("/opcionmenu")
public class opcionmenucontrolador
{
    @Autowired
    private opcionmenuserv objservicio;
    
    @GetMapping
    public List<SclOpcionMenu> listar()
    { return objservicio.listar(); }
    
    @PostMapping
    public SclOpcionMenu insertar(@RequestBody SclOpcionMenu usu)
    { return objservicio.insertar(usu); }
    
    @PutMapping
    public SclOpcionMenu actualizar(@RequestBody SclOpcionMenu usu)
    { return objservicio.actualizar(usu); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclOpcionMenu usu)
    { objservicio.eliminar(usu); }
    
}
