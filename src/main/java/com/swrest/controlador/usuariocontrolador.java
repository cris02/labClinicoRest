
package com.swrest.controlador;

import com.swrest.model.SclUsuario;
import com.swrest.servicio.usuarioserv;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuario")
public class usuariocontrolador
{
    @Autowired
    private usuarioserv usuarioservicio;
    
    @GetMapping("/all")
    public List<SclUsuario> listar()
    { return usuarioservicio.listar(); }
    
    @PostMapping("/save")
    public SclUsuario insertar(@RequestBody SclUsuario usu)
    { return usuarioservicio.insertar(usu); }
    
    @PutMapping("/upd")
    public SclUsuario actualizar(@RequestBody SclUsuario usu)
    { return usuarioservicio.actualizar(usu); }
    
    @PutMapping("/flag")
    public SclUsuario darDeBaja(@RequestBody SclUsuario usu)
    { return usuarioservicio.darDeBaja(usu); }
    
    
    @GetMapping("/recuperar") //?id=
    public SclUsuario sendMail(@RequestParam Integer id) {
    	return usuarioservicio.generarClave(id);
    }
}
