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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_areadelaboratorio", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_area"})})
@NamedQueries({
    @NamedQuery(name = "SclAreadelaboratorio.findAll", query = "SELECT s FROM SclAreadelaboratorio s")})
public class SclAreadelaboratorio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_area", nullable = false)
    private Integer idArea;
    @Basic(optional = false)
    @Column(name = "nom_area", nullable = false, length = 25)
    private String nomArea;
    @Basic(optional = false)
    @Column(name = "cod_area", nullable = false, length = 10)
    private String codArea;
    @JsonIgnore
    @JoinTable(name = "scl_profecionalporarea", joinColumns = {
        @JoinColumn(name = "id_area", referencedColumnName = "id_area", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<SclUsuario> sclUsuarioList;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclAreadelaboratorio", fetch = FetchType.LAZY)
    private List<SclHechosArea> sclHechosAreaList;

    public SclAreadelaboratorio() {
    }

    public SclAreadelaboratorio(Integer idArea) {
        this.idArea = idArea;
    }

    public SclAreadelaboratorio(Integer idArea, String nomArea, String codArea) {
        this.idArea = idArea;
        this.nomArea = nomArea;
        this.codArea = codArea;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getNomArea() {
        return nomArea;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public List<SclUsuario> getSclUsuarioList() {
        return sclUsuarioList;
    }

    public void setSclUsuarioList(List<SclUsuario> sclUsuarioList) {
        this.sclUsuarioList = sclUsuarioList;
    }

    public List<SclHechosArea> getSclHechosAreaList() {
        return sclHechosAreaList;
    }

    public void setSclHechosAreaList(List<SclHechosArea> sclHechosAreaList) {
        this.sclHechosAreaList = sclHechosAreaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArea != null ? idArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclAreadelaboratorio)) {
            return false;
        }
        SclAreadelaboratorio other = (SclAreadelaboratorio) object;
        if ((this.idArea == null && other.idArea != null) || (this.idArea != null && !this.idArea.equals(other.idArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclAreadelaboratorio[ idArea=" + idArea + " ]";
    }
    
}
