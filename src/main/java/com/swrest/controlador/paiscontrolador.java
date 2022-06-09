
package com.swrest.controlador;

import com.swrest.model.SclPais;
import com.swrest.request.PaisRequest;
import com.swrest.servicio.paisserv;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pais")

public class paiscontrolador implements Serializable {
	
	private final static Logger LOG = org.slf4j.LoggerFactory.getLogger(paiscontrolador.class);
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private paisserv paisservicio;

	@GetMapping("/all")
	public List<SclPais> listar() {
		return paisservicio.listar();
	}

	@PostMapping("/insertar")
	public SclPais insertPais (@RequestBody PaisRequest usu) {
		
		SclPais pais = new SclPais();
		pais.setIdPais(usu.getIdPais());
		pais.setNomPais(usu.getNomPais());
		pais.setIdIso2(usu.getIdIso2());
		return paisservicio.insertar(pais);
	}

	@PutMapping
	public SclPais actualizar(@RequestBody SclPais a_obj) {
		return paisservicio.actualizar(a_obj);
	}

	@DeleteMapping
	public void eliminar(@RequestBody SclPais a_obj) {
		paisservicio.eliminar(a_obj);
	}

	@GetMapping("pais/{id}")
	public SclPais show(@PathVariable String id) {
		return paisservicio.findById(id);
	}

//	@DeleteMapping("pais/{id}")
//	public void delete(@PathVariable String id) {
//		paisservicio.delete(id);
//	}
//
//	@PutMapping("pais/{id}")
//	public SclPais update(@RequestBody SclPais pais, @PathVariable String id) {
//		SclPais paisActual = paisservicio.findById(id);
//		paisActual.setIdPais(pais.getIdPais());
//		paisActual.setIdPais(pais.getNomPais());
//		paisActual.setIdPais(pais.getIdIso2());
//		return paisservicio.actualizar(paisActual);
//	}

}
