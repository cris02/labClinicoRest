package com.swrest.response;

import java.util.Date;


public class UsuarioResponse {
	
	private Integer idUsuario;
    private String nombre;
    private String apellido;
    private String clave;
    private String correo;
    private boolean activo;
    private String profesion;
    private Integer njv;
    private String usuCrea;
    private String usuModi;
    private Date fecCrea;
    private Date fecModi;
    
    public UsuarioResponse () { }

	public UsuarioResponse(Integer idUsuario, String nombre, String apellido, String clave, String correo,
			boolean activo, String profesion, Integer njv, String usuCrea, String usuModi, Date fecCrea, Date fecModi) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.correo = correo;
		this.activo = activo;
		this.profesion = profesion;
		this.njv = njv;
		this.usuCrea = usuCrea;
		this.usuModi = usuModi;
		this.fecCrea = fecCrea;
		this.fecModi = fecModi;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Integer getNjv() {
		return njv;
	}

	public void setNjv(Integer njv) {
		this.njv = njv;
	}

	public String getUsuCrea() {
		return usuCrea;
	}

	public void setUsuCrea(String usuCrea) {
		this.usuCrea = usuCrea;
	}

	public String getUsuModi() {
		return usuModi;
	}

	public void setUsuModi(String usuModi) {
		this.usuModi = usuModi;
	}

	public Date getFecCrea() {
		return fecCrea;
	}

	public void setFecCrea(Date fecCrea) {
		this.fecCrea = fecCrea;
	}

	public Date getFecModi() {
		return fecModi;
	}

	public void setFecModi(Date fecModi) {
		this.fecModi = fecModi;
	}

}
