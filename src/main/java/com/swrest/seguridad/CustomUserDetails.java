package com.swrest.seguridad;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.swrest.model.SclUsuario;


public class CustomUserDetails implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	private SclUsuario usuario;
	
	public CustomUserDetails(SclUsuario usuario) {
		super();
		this.usuario = usuario;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return usuario.getClave();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return usuario.getCorreo();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return usuario.getActivo();
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return usuario.getActivo();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return usuario.getActivo();
	}

}