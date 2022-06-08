package com.swrest.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.swrest.model.SclUsuario;
import com.swrest.response.LoginResponse;
import com.swrest.seguridad.CUDInterface;
import com.swrest.seguridad.CustomUserDetails;

@Service
public class CustomUserDetailsServ implements CUDInterface {
	
	@Autowired
    private usuarioserv usuarios;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//System.out.println("\nUsername: " + username);
		SclUsuario user = usuarios.listarCorreo(username.toLowerCase());
		if(user == null)
			throw new UsernameNotFoundException("El usuario no existe");
		
		return new CustomUserDetails(user);
	}
	
	
	public LoginResponse login(String email, String clave) {
		UserDetails user = loadUserByUsername(email);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		LoginResponse response = new LoginResponse();
		response.setUsuario(usuarios.listarCorreo(email));
		
		if(encoder.matches(clave, user.getPassword())) {
			response.setUserValidate(true);
			return response;
		}
		else {
			response.setUserValidate(false);
			return response;
		}
	}

}
