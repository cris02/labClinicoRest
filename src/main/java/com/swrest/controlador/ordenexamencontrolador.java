package com.swrest.controlador;

import java.util.List;

import org.slf4j.Logger;
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

import com.swrest.model.SclOrdendeexamen;
import com.swrest.model.VExamenes;
import com.swrest.request.ExamenResponse;
import com.swrest.servicio.ordendeexamenserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/orden")
public class ordenexamencontrolador {
	
	private final static Logger LOG = org.slf4j.LoggerFactory.getLogger(ordenexamencontrolador.class);
	
	@Autowired
	private ordendeexamenserv servicio;
	
	@GetMapping("/all")
    public List<SclOrdendeexamen> listar() { 
		List<SclOrdendeexamen> listOrdenes =  servicio.listar();
		for (SclOrdendeexamen sclOrdendeexamen : listOrdenes) {
			sclOrdendeexamen.setPacienteId(sclOrdendeexamen.getIdPaciente().getIdPaciente());
		}
		return  listOrdenes;
	}
	
	@GetMapping("/find") //?id=
    public SclOrdendeexamen listarId(@RequestParam Integer id)
    { return servicio.listarId(id); }
	
	@GetMapping("/findPaciente") //?id=
    public List<SclOrdendeexamen> listarIdPaciente(@RequestParam Integer id)
    { return servicio.listarOrdenPaciente(id); }
    
    @PostMapping("/save")
    public SclOrdendeexamen insertar(@RequestBody SclOrdendeexamen usu)
    { return servicio.insertar(usu); }
    
    @PutMapping("/upd")
    public SclOrdendeexamen actualizar(@RequestBody SclOrdendeexamen a_obj)
    { return servicio.actualizar(a_obj); }
    
    @DeleteMapping("del")
    public void eliminar(@RequestBody SclOrdendeexamen a_obj)
    { servicio.eliminar(a_obj); }
    
    @GetMapping("/listarExamen/{id}")
    public List<VExamenes> listarExamen(@PathVariable Integer id) {
    	return servicio.listarExamenes(id);
    }
}
