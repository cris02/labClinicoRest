/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_opcionmenu", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "id_opci" }) })
@NamedQueries({ @NamedQuery(name = "SclOpcionmenu.findAll", query = "SELECT s FROM SclOpcionmenu s") })

public class SclOpcionmenu implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_opci", nullable = false)
	private Integer idOpci;
	@Basic(optional = false)
	@Column(name = "nom_opcion", nullable = false, length = 30)
	private String nomOpcion;
	@Basic(optional = false)
	@Column(name = "url", nullable = false, length = 60)
	private String url;
	@Basic(optional = false)
	@Column(name = "icon", nullable = false, length = 60)
	private String icon;
	@Column(name = "parametros", length = 60)
	private String parametros;
	@JoinTable(name = "scl_opciondemenupor_rol", joinColumns = {
			@JoinColumn(name = "id_opci", referencedColumnName = "id_opci", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_rol", referencedColumnName = "id_rol", nullable = false) })
	@ManyToMany(fetch = FetchType.LAZY)
	private List<SclRol> sclRolList;

	public SclOpcionmenu() {
    }

	public SclOpcionmenu(Integer idOpci) {
        this.idOpci = idOpci;
    }

	public SclOpcionmenu(Integer idOpci, String nomOpcion, String url, String icon) {
        this.idOpci = idOpci;
        this.nomOpcion = nomOpcion;
        this.url = url;
        this.icon = icon;
    }

	public Integer getIdOpci() {
		return idOpci;
	}

	public void setIdOpci(Integer idOpci) {
		this.idOpci = idOpci;
	}

	public String getNomOpcion() {
		return nomOpcion;
	}

	public void setNomOpcion(String nomOpcion) {
		this.nomOpcion = nomOpcion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getParametros() {
		return parametros;
	}

	public void setParametros(String parametros) {
		this.parametros = parametros;
	}

	public List<SclRol> getSclRolList() {
		return sclRolList;
	}

	public void setSclRolList(List<SclRol> sclRolList) {
		this.sclRolList = sclRolList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idOpci != null ? idOpci.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof SclOpcionmenu)) {
			return false;
		}
		SclOpcionmenu other = (SclOpcionmenu) object;
		if ((this.idOpci == null && other.idOpci != null)
				|| (this.idOpci != null && !this.idOpci.equals(other.idOpci))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "persistencialabclinico.entities.SclOpcionmenu[ idOpci=" + idOpci + " ]";
	}

}
