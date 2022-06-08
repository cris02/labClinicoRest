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

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_rango_edad", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_rango_edad"})})
@NamedQueries({
    @NamedQuery(name = "SclRangoEdad.findAll", query = "SELECT s FROM SclRangoEdad s")})
public class SclRangoEdad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rango_edad", nullable = false)
    private Integer idRangoEdad;
    @Basic(optional = false)
    @Column(name = "leyenda", nullable = false, length = 50)
    private String leyenda;
    @Column(name = "val_inferior")
    private Integer valInferior;
    @Column(name = "val_superior")
    private Integer valSuperior;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclRangoEdad", fetch = FetchType.LAZY)
    private List<SclHechoSangre> sclHechoSangreList;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclRangoEdad", fetch = FetchType.LAZY)
    private List<SclHechoEpidemiologia> sclHechoEpidemiologiaList;

    public SclRangoEdad() {
    }

    public SclRangoEdad(Integer idRangoEdad) {
        this.idRangoEdad = idRangoEdad;
    }

    public SclRangoEdad(Integer idRangoEdad, String leyenda) {
        this.idRangoEdad = idRangoEdad;
        this.leyenda = leyenda;
    }

    public Integer getIdRangoEdad() {
        return idRangoEdad;
    }

    public void setIdRangoEdad(Integer idRangoEdad) {
        this.idRangoEdad = idRangoEdad;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    public Integer getValInferior() {
        return valInferior;
    }

    public void setValInferior(Integer valInferior) {
        this.valInferior = valInferior;
    }

    public Integer getValSuperior() {
        return valSuperior;
    }

    public void setValSuperior(Integer valSuperior) {
        this.valSuperior = valSuperior;
    }

    public List<SclHechoSangre> getSclHechoSangreList() {
        return sclHechoSangreList;
    }

    public void setSclHechoSangreList(List<SclHechoSangre> sclHechoSangreList) {
        this.sclHechoSangreList = sclHechoSangreList;
    }

    public List<SclHechoEpidemiologia> getSclHechoEpidemiologiaList() {
        return sclHechoEpidemiologiaList;
    }

    public void setSclHechoEpidemiologiaList(List<SclHechoEpidemiologia> sclHechoEpidemiologiaList) {
        this.sclHechoEpidemiologiaList = sclHechoEpidemiologiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRangoEdad != null ? idRangoEdad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclRangoEdad)) {
            return false;
        }
        SclRangoEdad other = (SclRangoEdad) object;
        if ((this.idRangoEdad == null && other.idRangoEdad != null) || (this.idRangoEdad != null && !this.idRangoEdad.equals(other.idRangoEdad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabv1.models.SclRangoEdad[ idRangoEdad=" + idRangoEdad + " ]";
    }
    
}
