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

import com.swrest.model.SclClinica;
import com.swrest.servicio.clinicaserv;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/clinica")
public class clinicacontrolador
{
	@Autowired
    private clinicaserv servicio;
	
	@GetMapping("/all")
    public List<SclClinica> clinicas()
    {	return servicio.listar();		}
	
	@PostMapping("/save")
	public SclClinica insertar(@RequestBody SclClinica c)
	{	return servicio.insertar(c);	}
	
	@PutMapping("/upd")
	public SclClinica actualizar(@RequestBody SclClinica c)
	{	return servicio.actualizar(c);	}
	
	@DeleteMapping("/del")
	public void eliminar(@RequestBody SclClinica c)
	{	servicio.eliminar(c);	}
}
