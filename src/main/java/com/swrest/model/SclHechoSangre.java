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

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_hecho_sangre", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_paciente", "id_rango_edad", "id_pais", "id_depto", "id_municipio", "id_ordenexamen", "id_hematologia", "sangre_anio", "sangre_mes"})})
@NamedQueries({
    @NamedQuery(name = "SclHechoSangre.findAll", query = "SELECT s FROM SclHechoSangre s")})
public class SclHechoSangre implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclHechoSangrePK sclHechoSangrePK;
    @Column(name = "cant_examen")
    private Integer cantExamen;
    @JoinColumns({
        @JoinColumn(name = "id_ordenexamen", referencedColumnName = "id_ordenexamen", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "id_hematologia", referencedColumnName = "id_hematologia", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclExamenhematologia sclExamenhematologia;
    @JoinColumns({
        @JoinColumn(name = "id_pais", referencedColumnName = "id_pais", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "id_depto", referencedColumnName = "id_depto", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclMunicipio sclMunicipio;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclPaciente sclPaciente;
    @JoinColumn(name = "id_rango_edad", referencedColumnName = "id_rango_edad", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclRangoEdad sclRangoEdad;

    public SclHechoSangre() {
    }

    public SclHechoSangre(SclHechoSangrePK sclHechoSangrePK) {
        this.sclHechoSangrePK = sclHechoSangrePK;
    }

    public SclHechoSangre(int idPaciente, int idRangoEdad, String idPais, int idDepto, int idMunicipio, int idOrdenexamen, int idHematologia, int sangreAnio, int sangreMes) {
        this.sclHechoSangrePK = new SclHechoSangrePK(idPaciente, idRangoEdad, idPais, idDepto, idMunicipio, idOrdenexamen, idHematologia, sangreAnio, sangreMes);
    }

    public SclHechoSangrePK getSclHechoSangrePK() {
        return sclHechoSangrePK;
    }

    public void setSclHechoSangrePK(SclHechoSangrePK sclHechoSangrePK) {
        this.sclHechoSangrePK = sclHechoSangrePK;
    }

    public Integer getCantExamen() {
        return cantExamen;
    }

    public void setCantExamen(Integer cantExamen) {
        this.cantExamen = cantExamen;
    }

    public SclExamenhematologia getSclExamenhematologia() {
        return sclExamenhematologia;
    }

    public void setSclExamenhematologia(SclExamenhematologia sclExamenhematologia) {
        this.sclExamenhematologia = sclExamenhematologia;
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

    public SclRangoEdad getSclRangoEdad() {
        return sclRangoEdad;
    }

    public void setSclRangoEdad(SclRangoEdad sclRangoEdad) {
        this.sclRangoEdad = sclRangoEdad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sclHechoSangrePK != null ? sclHechoSangrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclHechoSangre)) {
            return false;
        }
        SclHechoSangre other = (SclHechoSangre) object;
        if ((this.sclHechoSangrePK == null && other.sclHechoSangrePK != null) || (this.sclHechoSangrePK != null && !this.sclHechoSangrePK.equals(other.sclHechoSangrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclHechoSangre[ sclHechoSangrePK=" + sclHechoSangrePK + " ]";
    }
    
}
