/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_hechos_area", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_pais", "id_depto", "id_municipio", "id_area", "id_paciente", "area_anio", "area_mes"})})
@NamedQueries({
    @NamedQuery(name = "SclHechosArea.findAll", query = "SELECT s FROM SclHechosArea s")})
public class SclHechosArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclHechosAreaPK sclHechosAreaPK;
    @Column(name = "cant_examenes")
    private Integer cantExamenes;
    @JsonIgnore
    @JoinColumn(name = "id_area", referencedColumnName = "id_area", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclAreadelaboratorio sclAreadelaboratorio;
    @JsonIgnore
    @JoinColumns({
        @JoinColumn(name = "id_pais", referencedColumnName = "id_pais", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "id_depto", referencedColumnName = "id_depto", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclMunicipio sclMunicipio;
    @JsonIgnore
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclPaciente sclPaciente;

    public SclHechosArea() {
    }

    public SclHechosArea(SclHechosAreaPK sclHechosAreaPK) {
        this.sclHechosAreaPK = sclHechosAreaPK;
    }

    public SclHechosArea(String idPais, int idDepto, int idMunicipio, int idArea, int idPaciente, int areaAnio, int areaMes) {
        this.sclHechosAreaPK = new SclHechosAreaPK(idPais, idDepto, idMunicipio, idArea, idPaciente, areaAnio, areaMes);
    }

    public SclHechosAreaPK getSclHechosAreaPK() {
        return sclHechosAreaPK;
    }

    public void setSclHechosAreaPK(SclHechosAreaPK sclHechosAreaPK) {
        this.sclHechosAreaPK = sclHechosAreaPK;
    }

    public Integer getCantExamenes() {
        return cantExamenes;
    }

    public void setCantExamenes(Integer cantExamenes) {
        this.cantExamenes = cantExamenes;
    }

    public SclAreadelaboratorio getSclAreadelaboratorio() {
        return sclAreadelaboratorio;
    }

    public void setSclAreadelaboratorio(SclAreadelaboratorio sclAreadelaboratorio) {
        this.sclAreadelaboratorio = sclAreadelaboratorio;
    }

    public SclMunicipio getSclMunicipio() {
        return sclMunicipio;
    }

    public void setSclMunicipio(SclMunicipio sclMunicipio) {
        this.sclMunicipio = sclMunicipio;
    }

    public SclPaciente getSclPaciente() {
        return sclPaciente;
    }

    public void setSclPaciente(SclPaciente sclPaciente) {
        this.sclPaciente = sclPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sclHechosAreaPK != null ? sclHechosAreaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclHechosArea)) {
            return false;
        }
        SclHechosArea other = (SclHechosArea) object;
        if ((this.sclHechosAreaPK == null && other.sclHechosAreaPK != null) || (this.sclHechosAreaPK != null && !this.sclHechosAreaPK.equals(other.sclHechosAreaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabv1.models.SclHechosArea[ sclHechosAreaPK=" + sclHechosAreaPK + " ]";
    }
    
}
