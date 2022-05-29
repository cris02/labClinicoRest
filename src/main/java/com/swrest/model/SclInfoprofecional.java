/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package persistencialab.entities;
package com.swrest.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_infoprofecional", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_usuario"})})
@NamedQueries({
    @NamedQuery(name = "SclInfoprofecional.findAll", query = "SELECT s FROM SclInfoprofecional s")})
public class SclInfoprofecional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_usuario", nullable = false, length = 30)
    private String idUsuario;
    @Basic(optional = false)
    
    @Column(name = "profesion", nullable = false, length = 25)
    private String profesion;
    @Basic(optional = false)
    @Column(name = "njv", nullable = false)
    
    private int njv;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<SclExamenquimicaclinica> sclExamenquimicaclinicaList;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    
    private SclUsuario sclUsuario;
    /*
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    */

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    
    private List<SclExamencoprologia> sclExamencoprologiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    
    private List<SclExamenurianalisis> sclExamenurianalisisList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    
    private List<SclExamenhematologia> sclExamenhematologiaList;

    public SclInfoprofecional() {
    }

    public SclInfoprofecional(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SclInfoprofecional(String idUsuario, String profesion, int njv) {
        this.idUsuario = idUsuario;
        this.profesion = profesion;
        this.njv = njv;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getNjv() {
        return njv;
    }

    public void setNjv(int njv) {
        this.njv = njv;
    }

    public List<SclExamenquimicaclinica> getSclExamenquimicaclinicaList() {
        return sclExamenquimicaclinicaList;
    }

    public void setSclExamenquimicaclinicaList(List<SclExamenquimicaclinica> sclExamenquimicaclinicaList) {
        this.sclExamenquimicaclinicaList = sclExamenquimicaclinicaList;
    }

    public SclUsuario getSclUsuario() {
        return sclUsuario;
    }

    public void setSclUsuario(SclUsuario sclUsuario) {
        this.sclUsuario = sclUsuario;
    }

    public List<SclExamencoprologia> getSclExamencoprologiaList() {
        return sclExamencoprologiaList;
    }

    public void setSclExamencoprologiaList(List<SclExamencoprologia> sclExamencoprologiaList) {
        this.sclExamencoprologiaList = sclExamencoprologiaList;
    }

    public List<SclExamenurianalisis> getSclExamenurianalisisList() {
        return sclExamenurianalisisList;
    }

    public void setSclExamenurianalisisList(List<SclExamenurianalisis> sclExamenurianalisisList) {
        this.sclExamenurianalisisList = sclExamenurianalisisList;
    }

    public List<SclExamenhematologia> getSclExamenhematologiaList() {
        return sclExamenhematologiaList;
    }

    public void setSclExamenhematologiaList(List<SclExamenhematologia> sclExamenhematologiaList) {
        this.sclExamenhematologiaList = sclExamenhematologiaList;
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
        if (!(object instanceof SclInfoprofecional)) {
            return false;
        }
        SclInfoprofecional other = (SclInfoprofecional) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclInfoprofecional[ idUsuario=" + idUsuario + " ]";
    }
    
}
