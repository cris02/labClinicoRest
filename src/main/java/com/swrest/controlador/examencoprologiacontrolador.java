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

import com.swrest.model.SclExamencoprologia;
import com.swrest.servicio.examenservice;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/examen")
public class examencoprologiacontrolador {
	
	@Autowired
	private examenservice servicio;
	
	@GetMapping("/cpl")
	public List<SclExamencoprologia> listarCoprologia() {
		return servicio.listarCopro();
	}
	
	@PostMapping("/cpl/save")
	public void insertar(@RequestBody SclExamencoprologia e) {
		servicio.insertar(e);
	}
	
	@PutMapping("/cpl/upd")
	public void actualizar(@RequestBody SclExamencoprologia e) {
		servicio.actualizar(e);
	}
	
	@DeleteMapping("/cpl/del")
	public void eliminar(@RequestBody SclExamencoprologia e) {
		servicio.eliminar(e);
	}
}
