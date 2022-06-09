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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swrest.model.SclHechosArea;
import com.swrest.model.SclHechosAreaPK;
import com.swrest.servicio.hechosserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/hechoarea")
public class hechoareacontrolador {
	
	@Autowired
	private hechosserv servicio;
	
	
	@GetMapping("/all")
	public List<SclHechosArea> listar() {
		return servicio.listarHechosArea();
	}
	
	@GetMapping("/find")
	public SclHechosArea listar(@RequestParam String p, Integer d, Integer m,
			Integer area, Integer pac, Integer an, Integer mes) {
		return servicio.listarHechosArea(new SclHechosAreaPK(p,d,m,area,pac,an,mes));
	}
	
	@PostMapping("/save")
	public SclHechosArea guardar(@RequestBody SclHechosArea h) {
		return servicio.insertarHechoArea(h);
	}
	
	@PutMapping("/upd")
	public SclHechosArea actualizar(@RequestBody SclHechosArea h) {
		return servicio.actualizarHechoArea(h);
	}
	
	@DeleteMapping("/del")
	public void eliminar(@RequestBody SclHechosArea h) {
		servicio.eliminarHechoArea(h);
	}
}
