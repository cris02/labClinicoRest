/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package persistencialab.entities;
package com.bad.labClinicoRest.model;

import java.io.Serializable;
import java.math.BigInteger;
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

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_hecho_epidemiologia", catalog = "labclinicodb", schema = "UESBAD", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_pais", "id_depto", "id_municipio", "id_ordenexamen", "id_quimicaclinica", "id_paciente"})})
@NamedQueries({
    @NamedQuery(name = "SclHechoEpidemiologia.findAll", query = "SELECT s FROM SclHechoEpidemiologia s")})
public class SclHechoEpidemiologia implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclHechoEpidemiologiaPK sclHechoEpidemiologiaPK;
    @Column(name = "cant_examenes")
    private BigInteger cantExamenes;
    @Column(name = "cant_colesterol")
    private BigInteger cantColesterol;
    @Column(name = "cant_acido_urico")
    private BigInteger cantAcidoUrico;
    @Column(name = "cant_glucosa")
    private BigInteger cantGlucosa;
    @JoinColumns({
        @JoinColumn(name = "id_ordenexamen", referencedColumnName = "id_ordenexamen", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "id_quimicaclinica", referencedColumnName = "id_quimicaclinica", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclExamenquimicaclinica sclExamenquimicaclinica;
    @JoinColumns({
        @JoinColumn(name = "id_pais", referencedColumnName = "id_pais", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "id_depto", referencedColumnName = "id_depto", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclMunicipio sclMunicipio;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclPaciente sclPaciente;

    public SclHechoEpidemiologia() {
    }

    public SclHechoEpidemiologia(SclHechoEpidemiologiaPK sclHechoEpidemiologiaPK) {
        this.sclHechoEpidemiologiaPK = sclHechoEpidemiologiaPK;
    }

    public SclHechoEpidemiologia(String idPais, int idDepto, int idMunicipio, int idOrdenexamen, int idQuimicaclinica, int idPaciente) {
        this.sclHechoEpidemiologiaPK = new SclHechoEpidemiologiaPK(idPais, idDepto, idMunicipio, idOrdenexamen, idQuimicaclinica, idPaciente);
    }

    public SclHechoEpidemiologiaPK getSclHechoEpidemiologiaPK() {
        return sclHechoEpidemiologiaPK;
    }

    public void setSclHechoEpidemiologiaPK(SclHechoEpidemiologiaPK sclHechoEpidemiologiaPK) {
        this.sclHechoEpidemiologiaPK = sclHechoEpidemiologiaPK;
    }

    public BigInteger getCantExamenes() {
        return cantExamenes;
    }

    public void setCantExamenes(BigInteger cantExamenes) {
        this.cantExamenes = cantExamenes;
    }

    public BigInteger getCantColesterol() {
        return cantColesterol;
    }

    public void setCantColesterol(BigInteger cantColesterol) {
        this.cantColesterol = cantColesterol;
    }

    public BigInteger getCantAcidoUrico() {
        return cantAcidoUrico;
    }

    public void setCantAcidoUrico(BigInteger cantAcidoUrico) {
        this.cantAcidoUrico = cantAcidoUrico;
    }

    public BigInteger getCantGlucosa() {
        return cantGlucosa;
    }

    public void setCantGlucosa(BigInteger cantGlucosa) {
        this.cantGlucosa = cantGlucosa;
    }

    public SclExamenquimicaclinica getSclExamenquimicaclinica() {
        return sclExamenquimicaclinica;
    }

    public void setSclExamenquimicaclinica(SclExamenquimicaclinica sclExamenquimicaclinica) {
        this.sclExamenquimicaclinica = sclExamenquimicaclinica;
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
        hash += (sclHechoEpidemiologiaPK != null ? sclHechoEpidemiologiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclHechoEpidemiologia)) {
            return false;
        }
        SclHechoEpidemiologia other = (SclHechoEpidemiologia) object;
        if ((this.sclHechoEpidemiologiaPK == null && other.sclHechoEpidemiologiaPK != null) || (this.sclHechoEpidemiologiaPK != null && !this.sclHechoEpidemiologiaPK.equals(other.sclHechoEpidemiologiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclHechoEpidemiologia[ sclHechoEpidemiologiaPK=" + sclHechoEpidemiologiaPK + " ]";
    }
    
}
