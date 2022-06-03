package com.swrest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclClinica;
import com.swrest.repositorio.ClinicaRepository;

@Service
public class clinicaserv {
	
	@Autowired
	private ClinicaRepository repository;
	
	public List<SclClinica> listar()
	{	return repository.findAll();	}
	
	public SclClinica insertar(SclClinica c)
	{	return repository.save(c);	}
	
	public SclClinica actualizar(SclClinica c) {
		if(repository.existsById(c.getIdClinica())) {
			return repository.save(c);
		}
		else return null;
	}
	
	public void eliminar(SclClinica c)
	{	repository.deleteById(c.getIdClinica());}
}
