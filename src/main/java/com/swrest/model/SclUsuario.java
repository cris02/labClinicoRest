/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "usuario", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_usuario"})})
@NamedQueries({
    @NamedQuery(name = "SclUsuario.findAll", query = "SELECT s FROM SclUsuario s")})
public class SclUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario", nullable = false)
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido", nullable = false, length = 30)
    private String apellido;
    @Basic(optional = false)
    @Column(name = "password", nullable = false, length = 60)
    private String clave;
    @Basic(optional = false)
    @Column(name = "correo", nullable = false, length = 25)
    private String correo;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Basic(optional = false)
    @Column(name = "usu_crea", nullable = false, length = 30)
    private String usuCrea;
    @Column(name = "usu_modi", length = 30)
    private String usuModi;
    @Basic(optional = false)
    @Column(name = "fec_crea", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecCrea;
    @Column(name = "fec_modi")
    @Temporal(TemporalType.DATE)
    private Date fecModi;

    public SclUsuario() {
    }

    public SclUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SclUsuario(String idUsuario, String nombre, String apellido, 
    		String clave, String correo, boolean activo, String usuCrea, Date fecCrea) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.correo = correo;
        this.activo = activo;
        this.usuCrea = usuCrea;
        this.fecCrea = fecCrea;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
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

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclUsuario)) {
            return false;
        }
        SclUsuario other = (SclUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.persistencia.SclUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
