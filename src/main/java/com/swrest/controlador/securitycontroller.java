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
	
    
    @GetMapping("/flag") //?id=
    public SclUsuario darDeBaja(@RequestParam Integer id) {
    	return service.darDeBaja(id);
    }
    
	
	@GetMapping("/reset") //?email=
    public String solicitudReinicio(@RequestParam String email) {
		return service.solicitarReinicio(email);
	}
    
	
    @GetMapping("/send") //?id=
    public String sendMail(@RequestParam Integer id) {
    	return service.generarClave(id);
    }
    
    @GetMapping("/psw") //?email= ... &c1= ... &c2= ...
    public String resetPassword(@RequestParam String email, String c1, String c2) {
    	return service.cambioClave(email, c1, c2);
    }
    
}
