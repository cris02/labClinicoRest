/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package persistencialab.entities;
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
public class SclHechoSangrePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_paciente", nullable = false)
    private int idPaciente;
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
    @Column(name = "id_ordenexamen", nullable = false)
    private int idOrdenexamen;
    @Basic(optional = false)
    @Column(name = "id_hematologia", nullable = false)
    private int idHematologia;

    public SclHechoSangrePK() {
    }

    public SclHechoSangrePK(int idPaciente, String idPais, int idDepto, int idMunicipio, int idOrdenexamen, int idHematologia) {
        this.idPaciente = idPaciente;
        this.idPais = idPais;
        this.idDepto = idDepto;
        this.idMunicipio = idMunicipio;
        this.idOrdenexamen = idOrdenexamen;
        this.idHematologia = idHematologia;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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

    public int getIdOrdenexamen() {
        return idOrdenexamen;
    }

    public void setIdOrdenexamen(int idOrdenexamen) {
        this.idOrdenexamen = idOrdenexamen;
    }

    public int getIdHematologia() {
        return idHematologia;
    }

    public void setIdHematologia(int idHematologia) {
        this.idHematologia = idHematologia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPaciente;
        hash += (idPais != null ? idPais.hashCode() : 0);
        hash += (int) idDepto;
        hash += (int) idMunicipio;
        hash += (int) idOrdenexamen;
        hash += (int) idHematologia;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclHechoSangrePK)) {
            return false;
        }
        SclHechoSangrePK other = (SclHechoSangrePK) object;
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if ((this.idPais == null && other.idPais != null) || (this.idPais != null && !this.idPais.equals(other.idPais))) {
            return false;
        }
        if (this.idDepto != other.idDepto) {
            return false;
        }
        if (this.idMunicipio != other.idMunicipio) {
            return false;
        }
        if (this.idOrdenexamen != other.idOrdenexamen) {
            return false;
        }
        if (this.idHematologia != other.idHematologia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclHechoSangrePK[ idPaciente=" + idPaciente + ", idPais=" + idPais + ", idDepto=" + idDepto + ", idMunicipio=" + idMunicipio + ", idOrdenexamen=" + idOrdenexamen + ", idHematologia=" + idHematologia + " ]";
    }
    
}
