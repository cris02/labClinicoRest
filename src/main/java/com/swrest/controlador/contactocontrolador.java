
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/contacto")
public class contactocontrolador
{
    @Autowired
    private contactoserv objservicio;
    
    @GetMapping("/all")
    public List<SclContacto> listar()
    { return objservicio.listar(); }
    
    @GetMapping("/find") //?tc = ...&p= ... &c= ...
    public SclContacto listar(@RequestParam Integer tc, Integer p, Integer c)
    { return objservicio.listarId(new SclContactoPK(tc,p,c)); }
    
    @PostMapping("/save")
    public SclContacto insertar(@RequestBody SclContacto usu)
    { return objservicio.insertar(usu); }
    
    @PutMapping("/upd")
    public SclContacto actualizar(@RequestBody SclContacto usu)
    { return objservicio.actualizar(usu); }
    
    @DeleteMapping("/del")
    public void eliminar(@RequestBody SclContacto usu)
    { objservicio.eliminar(usu); }
    
}
