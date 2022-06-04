package com.swrest.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swrest.model.SclUsuario;
import com.swrest.servicio.securityserv;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/sec")
public class securitycontroller {
	
	@Autowired
	private securityserv service;

    @GetMapping("/reset") //?id=
    public SclUsuario sendMail(@RequestParam Integer id) {
    	return service.generarClave(id);
    }
    
}
