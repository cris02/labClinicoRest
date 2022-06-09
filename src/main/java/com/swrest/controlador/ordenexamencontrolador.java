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

import com.swrest.model.SclOrdendeexamen;
import com.swrest.servicio.ordendeexamenserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/orden")
public class ordenexamencontrolador {
	
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
    
    @PostMapping("/save")
    public SclOrdendeexamen insertar(@RequestBody SclOrdendeexamen usu)
    { return servicio.insertar(usu); }
    
    @PutMapping("/upd")
    public SclOrdendeexamen actualizar(@RequestBody SclOrdendeexamen a_obj)
    { return servicio.actualizar(a_obj); }
    
    @DeleteMapping("del")
    public void eliminar(@RequestBody SclOrdendeexamen a_obj)
    { servicio.eliminar(a_obj); }
}
