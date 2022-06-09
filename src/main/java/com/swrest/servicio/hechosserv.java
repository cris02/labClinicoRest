package com.swrest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclHechoEpidemiologia;
import com.swrest.model.SclHechoSangre;
import com.swrest.model.SclHechosArea;
import com.swrest.repositorio.HechoEpidemRepository;
import com.swrest.repositorio.HechoSangreRepository;
import com.swrest.repositorio.HechosAreaRepository;

@Service
public class hechosserv {
	
	@Autowired
	private HechosAreaRepository  hechoarearepo;
	@Autowired
	private HechoEpidemRepository hechoepidemrepo;
	@Autowired
	private HechoSangreRepository hechosangrerepo;
	
	// Metodos select
	public List<SclHechosArea> listarHechosArea() {
		return hechoarearepo.findAll();
	}
	
	public List<SclHechoEpidemiologia> listarHechosEpidem() {
		return hechoepidemrepo.findAll();
	}
	
	public List<SclHechoSangre> listarHechosSangre() {
		return hechosangrerepo.findAll();
	}
	
	//Metodos insert
	public SclHechosArea insertarHechoArea(SclHechosArea hecho) {
		return hechoarearepo.save(hecho);
	}

	public SclHechoEpidemiologia insertarHechoEpidem(SclHechoEpidemiologia hecho) {
		return hechoepidemrepo.save(hecho);
	}

	public SclHechoSangre insertarHechoSangre(SclHechoSangre hecho) {
		return hechosangrerepo.save(hecho);
	}
	
	//Metodos update
	public SclHechosArea actualizarHechoArea(SclHechosArea hecho) {
		return hechoarearepo.save(hecho);
	}

	public SclHechoEpidemiologia actualizarHechoEpidem(SclHechoEpidemiologia hecho) {
		return hechoepidemrepo.save(hecho);
	}

	public SclHechoSangre actualizarHechoSangre(SclHechoSangre hecho) {
		return hechosangrerepo.save(hecho);
	}
	
	//Metodos delete
	public void eliminarHechoArea(SclHechosArea hecho) {
		hechoarearepo.deleteById(hecho.getSclHechosAreaPK());
	}
	
	public void eliminarHechoEpidem(SclHechoEpidemiologia hecho) {
		hechoepidemrepo.deleteById(hecho.getSclHechoEpidemiologiaPK());
	}
	
	public void eliminarHechoSangre(SclHechoSangre hecho) {
		hechosangrerepo.deleteById(hecho.getSclHechoSangrePK());
	}
}
