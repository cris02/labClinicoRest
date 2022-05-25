package com.bad.labClinicoRest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bad.labClinicoRest.model.SclPaciente;
import com.bad.labClinicoRest.repositorio.PacienteRepository;

@Service
public class PacienteServ {
	
	@Autowired
	private PacienteRepository data;
	
	public List<SclPaciente> listar() {
		return data.findAll();
	}
	
	//Insertar y actualizar
	public SclPaciente insertar(SclPaciente p) {
		return data.save(p);
	}
	
	//Eliminar
	public void eliminar(int id) {
		data.deleteById(id);
	}
	
}
