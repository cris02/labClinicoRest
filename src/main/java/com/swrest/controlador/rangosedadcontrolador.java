package com.swrest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swrest.model.SclRangoEdad;
import com.swrest.servicio.rangoedadservice;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rangos")
public class rangosedadcontrolador {
	
	@Autowired
	private rangoedadservice servicio;
	
	@GetMapping("/all")
	public List<SclRangoEdad> listar() {
		return servicio.listaRangos();
	}
}
