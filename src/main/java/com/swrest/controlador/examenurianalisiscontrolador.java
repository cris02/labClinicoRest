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

import com.swrest.model.SclExamenurianalisis;
import com.swrest.servicio.examenservice;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/examen")
public class examenurianalisiscontrolador {
	
	@Autowired
	private examenservice servicio;
	
	@GetMapping("/uri")
	public List<SclExamenurianalisis> listarUrianalisis() {
		return servicio.listarUri();
	}

	@PostMapping("/uri/save")
	public void insertar(@RequestBody SclExamenurianalisis e) {
		servicio.insertar(e);
	}
	
	@PutMapping("/uri/upd")
	public void actualizar(@RequestBody SclExamenurianalisis e) {
		servicio.actualizar(e);
	}
	
	@DeleteMapping("/uri/del")
	public void eliminar(@RequestBody SclExamenurianalisis e) {
		servicio.eliminar(e);
	}
}
