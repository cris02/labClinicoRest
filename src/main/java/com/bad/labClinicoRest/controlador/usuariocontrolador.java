
package com.bad.labClinicoRest.controlador;

import com.bad.labClinicoRest.model.SclUsuario;
import com.bad.labClinicoRest.servicio.usuarioserv;

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
@RequestMapping("/usuario")
public class usuariocontrolador
{
    @Autowired
    private usuarioserv usuarioservicio;
    
    @GetMapping
    public List<SclUsuario> listar()
    { return usuarioservicio.listar(); }
    
    @PostMapping
    public SclUsuario insertar(@RequestBody SclUsuario usu)
    { return usuarioservicio.insertar(usu); }
    
    @PutMapping
    public SclUsuario actualizar(@RequestBody SclUsuario usu)
    { return usuarioservicio.actualizar(usu); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclUsuario usu)
    { usuarioservicio.eliminar(usu); }
    
}
