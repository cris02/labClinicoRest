/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_usuario", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_usuario"})})
@NamedQueries({
    @NamedQuery(name = "SclUsuario.findAll", query = "SELECT s FROM SclUsuario s")})
public class SclUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido", nullable = false, length = 30)
    private String apellido;
    @Basic(optional = false)
    @Column(name = "clave", nullable = false, length = 60)
    private String clave;
    @Basic(optional = false)
    @Column(name = "correo", nullable = false, length = 25)
    private String correo;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "profesion", length = 25)
    private String profesion;
    @Column(name = "njv")
    private Integer njv;
    @Basic(optional = false)
    @Column(name = "usu_crea", nullable = false, length = 30)
    private String usuCrea;
    @Basic(optional = false)
    @Column(name = "usu_modi", nullable = false, length = 30)
    private String usuModi;
    @Basic(optional = false)
    @Column(name = "fec_crea", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecCrea;
    @Column(name = "fec_modi")
    @Temporal(TemporalType.DATE)
    private Date fecModi;
    @ManyToMany(mappedBy = "sclUsuarioList", fetch = FetchType.LAZY)
    private List<SclAreadelaboratorio> sclAreadelaboratorioList;
    @JsonIncludeProperties({"idClinica"})
    @JoinColumn(name = "id_clinica", referencedColumnName = "id_clinica", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclClinica idClinica;

    public SclUsuario() {
    }

    public SclUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SclUsuario(Integer idUsuario, String nombre, String apellido, String clave, String correo, boolean activo, String usuCrea, String usuModi, Date fecCrea) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.correo = correo;
        this.activo = activo;
        this.usuCrea = usuCrea;
        this.usuModi = usuModi;
        this.fecCrea = fecCrea;
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

    public boolean getActivo() {
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

    public List<SclAreadelaboratorio> getSclAreadelaboratorioList() {
        return sclAreadelaboratorioList;
    }

    public void setSclAreadelaboratorioList(List<SclAreadelaboratorio> sclAreadelaboratorioList) {
        this.sclAreadelaboratorioList = sclAreadelaboratorioList;
    }

    public SclClinica getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(SclClinica idClinica) {
        this.idClinica = idClinica;
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
        return "persistencialabclinico.entities.SclUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
