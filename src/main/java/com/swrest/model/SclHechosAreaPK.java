/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author crist
 */
@Embeddable
public class SclHechosAreaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_pais", nullable = false, length = 3)
    private String idPais;
    @Basic(optional = false)
    @Column(name = "id_depto", nullable = false)
    private int idDepto;
    @Basic(optional = false)
    @Column(name = "id_municipio", nullable = false)
    private int idMunicipio;
    @Basic(optional = false)
    @Column(name = "id_area", nullable = false)
    private int idArea;
    @Basic(optional = false)
    @Column(name = "id_paciente", nullable = false)
    private int idPaciente;
    @Basic(optional = false)
    @Column(name = "area_anio", nullable = false)
    private int areaAnio;
    @Basic(optional = false)
    @Column(name = "area_mes", nullable = false)
    private int areaMes;

    public SclHechosAreaPK() {
    }

    public SclHechosAreaPK(String idPais, int idDepto, int idMunicipio, int idArea, int idPaciente, int areaAnio, int areaMes) {
        this.idPais = idPais;
        this.idDepto = idDepto;
        this.idMunicipio = idMunicipio;
        this.idArea = idArea;
        this.idPaciente = idPaciente;
        this.areaAnio = areaAnio;
        this.areaMes = areaMes;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public int getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(int idDepto) {
        this.idDepto = idDepto;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getAreaAnio() {
        return areaAnio;
    }

    public void setAreaAnio(int areaAnio) {
        this.areaAnio = areaAnio;
    }

    public int getAreaMes() {
        return areaMes;
    }

    public void setAreaMes(int areaMes) {
        this.areaMes = areaMes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPais != null ? idPais.hashCode() : 0);
        hash += (int) idDepto;
        hash += (int) idMunicipio;
        hash += (int) idArea;
        hash += (int) idPaciente;
        hash += (int) areaAnio;
        hash += (int) areaMes;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclHechosAreaPK)) {
            return false;
        }
        SclHechosAreaPK other = (SclHechosAreaPK) object;
        if ((this.idPais == null && other.idPais != null) || (this.idPais != null && !this.idPais.equals(other.idPais))) {
            return false;
        }
        if (this.idDepto != other.idDepto) {
            return false;
        }
        if (this.idMunicipio != other.idMunicipio) {
            return false;
        }
        if (this.idArea != other.idArea) {
            return false;
        }
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if (this.areaAnio != other.areaAnio) {
            return false;
        }
        if (this.areaMes != other.areaMes) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabv1.models.SclHechosAreaPK[ idPais=" + idPais + ", idDepto=" + idDepto + ", idMunicipio=" + idMunicipio + ", idArea=" + idArea + ", idPaciente=" + idPaciente + ", areaAnio=" + areaAnio + ", areaMes=" + areaMes + " ]";
    }
    
}
