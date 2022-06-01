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

import com.swrest.model.SclExamenhematologia;
import com.swrest.servicio.examenservice;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/examen")
public class examenhematologiacontrolador {
	
	@Autowired
	private examenservice servicio;
	
	@GetMapping("/hma")
	public List<SclExamenhematologia> listarHematologia() {
		return servicio.listarHema();
	}
	
	@PostMapping("/hma/save")
	public void insertar(@RequestBody SclExamenhematologia e) {
		servicio.insertar(e);
	}
	
	@PutMapping("/hma/upd")
	public void actualizar(@RequestBody SclExamenhematologia e) {
		servicio.actualizar(e);
	}
	
	@DeleteMapping("/hma/del")
	public void eliminar(@RequestBody SclExamenhematologia e) {
		servicio.eliminar(e);
	}
}
