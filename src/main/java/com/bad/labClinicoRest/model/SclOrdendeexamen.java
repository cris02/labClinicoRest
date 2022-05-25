/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package persistencialab.entities;
package com.bad.labClinicoRest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_ordendeexamen", catalog = "labclinicodb", schema = "UESBAD", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_ordenexamen"})})
@NamedQueries({
    @NamedQuery(name = "SclOrdendeexamen.findAll", query = "SELECT s FROM SclOrdendeexamen s")})
public class SclOrdendeexamen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_ordenexamen", nullable = false)
    private Integer idOrdenexamen;
    @Basic(optional = false)
    @Column(name = "fecha_muestra", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaMuestra;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclOrdendeexamen", fetch = FetchType.LAZY)
    private List<SclExamenquimicaclinica> sclExamenquimicaclinicaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclOrdendeexamen", fetch = FetchType.LAZY)
    private List<SclExamencoprologia> sclExamencoprologiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclOrdendeexamen", fetch = FetchType.LAZY)
    private List<SclExamenurianalisis> sclExamenurianalisisList;
    @JoinColumns({
        @JoinColumn(name = "id_pais", referencedColumnName = "id_pais"),
        @JoinColumn(name = "id_depto", referencedColumnName = "id_depto"),
        @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio")})
    @ManyToOne(fetch = FetchType.LAZY)
    private SclMunicipio sclMunicipio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclOrdendeexamen", fetch = FetchType.LAZY)
    private List<SclHechosArea> sclHechosAreaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclOrdendeexamen", fetch = FetchType.LAZY)
    private List<SclExamenhematologia> sclExamenhematologiaList;

    public SclOrdendeexamen() {
    }

    public SclOrdendeexamen(Integer idOrdenexamen) {
        this.idOrdenexamen = idOrdenexamen;
    }

    public SclOrdendeexamen(Integer idOrdenexamen, Date fechaMuestra) {
        this.idOrdenexamen = idOrdenexamen;
        this.fechaMuestra = fechaMuestra;
    }

    public Integer getIdOrdenexamen() {
        return idOrdenexamen;
    }

    public void setIdOrdenexamen(Integer idOrdenexamen) {
        this.idOrdenexamen = idOrdenexamen;
    }

    public Date getFechaMuestra() {
        return fechaMuestra;
    }

    public void setFechaMuestra(Date fechaMuestra) {
        this.fechaMuestra = fechaMuestra;
    }

    public List<SclExamenquimicaclinica> getSclExamenquimicaclinicaList() {
        return sclExamenquimicaclinicaList;
    }

    public void setSclExamenquimicaclinicaList(List<SclExamenquimicaclinica> sclExamenquimicaclinicaList) {
        this.sclExamenquimicaclinicaList = sclExamenquimicaclinicaList;
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

    public SclMunicipio getSclMunicipio() {
        return sclMunicipio;
    }

    public void setSclMunicipio(SclMunicipio sclMunicipio) {
        this.sclMunicipio = sclMunicipio;
    }

    public List<SclHechosArea> getSclHechosAreaList() {
        return sclHechosAreaList;
    }

    public void setSclHechosAreaList(List<SclHechosArea> sclHechosAreaList) {
        this.sclHechosAreaList = sclHechosAreaList;
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
        hash += (idOrdenexamen != null ? idOrdenexamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclOrdendeexamen)) {
            return false;
        }
        SclOrdendeexamen other = (SclOrdendeexamen) object;
        if ((this.idOrdenexamen == null && other.idOrdenexamen != null) || (this.idOrdenexamen != null && !this.idOrdenexamen.equals(other.idOrdenexamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclOrdendeexamen[ idOrdenexamen=" + idOrdenexamen + " ]";
    }
    
}
