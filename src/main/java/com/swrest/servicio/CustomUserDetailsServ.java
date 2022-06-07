package com.swrest.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.swrest.model.CustomUserDetails;
import com.swrest.model.SclUsuario;


public class CustomUserDetailsServ implements UserDetailsService {
	
	@Autowired
    private usuarioserv usuarios;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("\nUsername: " + username);
		SclUsuario us = usuarios.listarCorreo(username.toLowerCase());
		
		return new CustomUserDetails(us);
	}

}
