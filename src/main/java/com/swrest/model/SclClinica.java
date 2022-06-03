/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_clinica", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_clinica"})})
@NamedQueries({
    @NamedQuery(name = "SclClinica.findAll", query = "SELECT s FROM SclClinica s")})
public class SclClinica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_clinica", nullable = false)
    private Integer idClinica;
    @Basic(optional = false)
    @Column(name = "nom_clinica", nullable = false, length = 25)
    private String nomClinica;
    @Basic(optional = false)
    @Column(name = "tel_clinica", nullable = false, length = 9)
    private String telClinica;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClinica", fetch = FetchType.LAZY)
    private List<SclUsuario> sclUsuarioList;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClinica", fetch = FetchType.LAZY)
    private List<SclPaciente> sclPacienteList;

    public SclClinica() {
    }

    public SclClinica(Integer idClinica) {
        this.idClinica = idClinica;
    }

    public SclClinica(Integer idClinica, String nomClinica, String telClinica) {
        this.idClinica = idClinica;
        this.nomClinica = nomClinica;
        this.telClinica = telClinica;
    }

    public Integer getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(Integer idClinica) {
        this.idClinica = idClinica;
    }

    public String getNomClinica() {
        return nomClinica;
    }

    public void setNomClinica(String nomClinica) {
        this.nomClinica = nomClinica;
    }

    public String getTelClinica() {
        return telClinica;
    }

    public void setTelClinica(String telClinica) {
        this.telClinica = telClinica;
    }

    public List<SclUsuario> getSclUsuarioList() {
        return sclUsuarioList;
    }

    public void setSclUsuarioList(List<SclUsuario> sclUsuarioList) {
        this.sclUsuarioList = sclUsuarioList;
    }

    public List<SclPaciente> getSclPacienteList() {
        return sclPacienteList;
    }

    public void setSclPacienteList(List<SclPaciente> sclPacienteList) {
        this.sclPacienteList = sclPacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClinica != null ? idClinica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclClinica)) {
            return false;
        }
        SclClinica other = (SclClinica) object;
        if ((this.idClinica == null && other.idClinica != null) || (this.idClinica != null && !this.idClinica.equals(other.idClinica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclClinica[ idClinica=" + idClinica + " ]";
    }
    
}
