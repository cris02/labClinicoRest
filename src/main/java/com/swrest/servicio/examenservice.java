package com.swrest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swrest.model.SclExamencoprologia;
import com.swrest.model.SclExamenhematologia;
import com.swrest.model.SclExamenquimicaclinica;
import com.swrest.model.SclExamenurianalisis;
import com.swrest.repositorio.ExamenCoproRepository;
import com.swrest.repositorio.ExamenHemaRepository;
import com.swrest.repositorio.ExamenQumicaRepository;
import com.swrest.repositorio.ExamenUrianalisisRepository;

@Service
public class examenservice {
	
	@Autowired
	private ExamenCoproRepository repo_copro;
	@Autowired
    private ExamenUrianalisisRepository repo_uri;
	@Autowired
	private ExamenHemaRepository repo_hema;
	@Autowired
	private ExamenQumicaRepository repo_qcl;
	
	//Metodos select
	public List<SclExamencoprologia> listarCopro()
	{	return repo_copro.findAll();	}
	
	public List<SclExamenurianalisis> listarUri()
    { 	return repo_uri.findAll();		}
	
	public List<SclExamenhematologia> listarHema()
    { 	return repo_hema.findAll();		}
	
	public List<SclExamenquimicaclinica> listarQcl()
	{	return repo_qcl.findAll();		}
	
	//Metodos insert
	public SclExamencoprologia insertar(SclExamencoprologia co)
	{	return repo_copro.save(co);		}
	
	public SclExamenurianalisis insertar(SclExamenurianalisis uri) 
	{	return repo_uri.save(uri);		}
	
	public SclExamenhematologia insertar(SclExamenhematologia hema)
	{	return repo_hema.save(hema);	}
	
	public SclExamenquimicaclinica insertar(SclExamenquimicaclinica qcl)
	{	return repo_qcl.save(qcl);		}
	
	//Metodos update
	public SclExamencoprologia actualizar(SclExamencoprologia co) {
		if(repo_copro.existsById(co.getSclExamencoprologiaPK()))
			return repo_copro.save(co);
		else return null;
	}
	
	public SclExamenurianalisis actualizar(SclExamenurianalisis uri) {
		if(repo_uri.existsById(uri.getSclExamenurianalisisPK()))
			return repo_uri.save(uri);
		else return null;
	}
	
	public SclExamenhematologia actualizar(SclExamenhematologia hema) {
		if(repo_hema.existsById(hema.getSclExamenhematologiaPK()))
			return repo_hema.save(hema);
		else return null;
	}
	
	public SclExamenquimicaclinica actualizar(SclExamenquimicaclinica qcl) {
		if(repo_qcl.existsById(qcl.getSclExamenquimicaclinicaPK()))
			return repo_qcl.save(qcl);
		else return null;
	}
	
	//Metodos delete
	public void eliminar(SclExamencoprologia co) {
		if(repo_copro.existsById(co.getSclExamencoprologiaPK()))
			repo_copro.deleteById(co.getSclExamencoprologiaPK());
	}
	
	public void eliminar(SclExamenurianalisis uri) {
		if(repo_uri.existsById(uri.getSclExamenurianalisisPK()))
			repo_uri.deleteById(uri.getSclExamenurianalisisPK());
	}
	
	public void eliminar(SclExamenhematologia hema) {
		if(repo_hema.existsById(hema.getSclExamenhematologiaPK()))
			repo_hema.deleteById(hema.getSclExamenhematologiaPK());
	}
	
	public void eliminar(SclExamenquimicaclinica qcl) {
		if(repo_qcl.existsById(qcl.getSclExamenquimicaclinicaPK()))
			repo_qcl.deleteById(qcl.getSclExamenquimicaclinicaPK());
	}
}
