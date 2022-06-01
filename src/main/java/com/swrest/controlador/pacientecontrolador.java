package com.swrest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swrest.model.SclPaciente;
import com.swrest.servicio.pacienteserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/paciente")
public class pacientecontrolador {
	
	@Autowired private pacienteserv servicio;
	
	@GetMapping("/all")
	public List<SclPaciente> listar() {
		return servicio.listar();
	}
	
	@PostMapping("/save")
	public void insertar(SclPaciente pac) {
		servicio.insertar(pac);
	}
	
	@PutMapping("/upd")
	public void actualizar(SclPaciente pac) {
		servicio.actualizar(pac);
	}
	
	@DeleteMapping("/del")
	public void eliminar(SclPaciente pac) {
		servicio.eliminar(pac);
	}
}
