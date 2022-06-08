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

import com.swrest.model.SclMunicipio;
import com.swrest.servicio.municipioserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/municipio")
public class municipiocontrolador {
	
	@Autowired
	private municipioserv servicio;
	

	@GetMapping("/all")
    public List<SclMunicipio> listar()
    { return servicio.listar(); }
    
    @PostMapping
    public SclMunicipio insertar(@RequestBody SclMunicipio usu)
    { return servicio.insertar(usu); }
    
    @PutMapping
    public SclMunicipio actualizar(@RequestBody SclMunicipio a_obj)
    { return servicio.actualizar(a_obj); }
    
    @DeleteMapping
    public void eliminar(@RequestBody SclMunicipio a_obj)
    { servicio.eliminar(a_obj); }
}
