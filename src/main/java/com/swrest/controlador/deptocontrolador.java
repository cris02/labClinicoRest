package com.swrest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swrest.model.SclDepartamento;
import com.swrest.model.SclMunicipio;
import com.swrest.servicio.departamentoserv;
import com.swrest.servicio.municipioserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/departamento")
public class deptocontrolador {
	
	@Autowired
	private departamentoserv service;
	@Autowired
	private municipioserv munservice;
	
	@GetMapping("/all")
	public List<SclDepartamento> listar() {
		return service.listar();
	}
	
	@GetMapping("/mun")
	public List<SclMunicipio> listarMunicipios() {
		return munservice.listar();
	}
}
