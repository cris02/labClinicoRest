package com.swrest.controlador;

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

import com.swrest.model.SclDepartamento;
import com.swrest.servicio.departamentoserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/depto")
public class departamentocontrolador {
	
	@Autowired
	private departamentoserv servicio;
	
	@GetMapping("/all")
    public List<SclDepartamento> listar()
    { return servicio.listar(); }
    
    @PostMapping
    public SclDepartamento insertar(@RequestBody SclDepartamento usu)
    { return servicio.insertar(usu); }
    
    @PutMapping
    public SclDepartamento actualizar(@RequestBody SclDepartamento a_obj)
    { return servicio.actualizar(a_obj); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclDepartamento a_obj)
    { servicio.eliminar(a_obj); }
}
