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

import com.swrest.model.SclValreferencia;
import com.swrest.servicio.valreferenciaserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vref")
public class valreferenciacontrolador {
	
	@Autowired
	private valreferenciaserv servicio;
	
	
	@GetMapping("/all")
	public List<SclValreferencia> listar() {
		return servicio.listar();
	}
	
	@PostMapping
    public SclValreferencia insertar(@RequestBody SclValreferencia a_obj)
    { return servicio.insertar(a_obj); }
    
    @PutMapping
    public SclValreferencia actualizar(@RequestBody SclValreferencia a_obj)
    { return servicio.actualizar(a_obj); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclValreferencia usu)
    { servicio.eliminar(usu); }
}
