package com.swrest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclRangoEdad;
import com.swrest.repositorio.RangoEdadRepository;

@Service
public class rangoedadservice {
	
	@Autowired
	private RangoEdadRepository rangoedadrepo;
	
	
	public List<SclRangoEdad> listaRangos(){
		return rangoedadrepo.findAll();
	}
}
