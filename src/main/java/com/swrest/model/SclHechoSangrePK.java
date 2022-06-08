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
public class SclHechoSangrePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_paciente", nullable = false)
    private int idPaciente;
    @Basic(optional = false)
    @Column(name = "id_rango_edad", nullable = false)
    private int idRangoEdad;
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
    @Basic(optional = false)
    @Column(name = "sangre_anio", nullable = false)
    private int sangreAnio;
    @Basic(optional = false)
    @Column(name = "sangre_mes", nullable = false)
    private int sangreMes;

    public SclHechoSangrePK() {
    }

    public SclHechoSangrePK(int idPaciente, int idRangoEdad, String idPais, int idDepto, int idMunicipio, int idOrdenexamen, int idHematologia, int sangreAnio, int sangreMes) {
        this.idPaciente = idPaciente;
        this.idRangoEdad = idRangoEdad;
        this.idPais = idPais;
        this.idDepto = idDepto;
        this.idMunicipio = idMunicipio;
        this.idOrdenexamen = idOrdenexamen;
        this.idHematologia = idHematologia;
        this.sangreAnio = sangreAnio;
        this.sangreMes = sangreMes;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdRangoEdad() {
        return idRangoEdad;
    }

    public void setIdRangoEdad(int idRangoEdad) {
        this.idRangoEdad = idRangoEdad;
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

    public int getSangreAnio() {
        return sangreAnio;
    }

    public void setSangreAnio(int sangreAnio) {
        this.sangreAnio = sangreAnio;
    }

    public int getSangreMes() {
        return sangreMes;
    }

    public void setSangreMes(int sangreMes) {
        this.sangreMes = sangreMes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPaciente;
        hash += (int) idRangoEdad;
        hash += (idPais != null ? idPais.hashCode() : 0);
        hash += (int) idDepto;
        hash += (int) idMunicipio;
        hash += (int) idOrdenexamen;
        hash += (int) idHematologia;
        hash += (int) sangreAnio;
        hash += (int) sangreMes;
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
        if (this.idRangoEdad != other.idRangoEdad) {
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
        if (this.sangreAnio != other.sangreAnio) {
            return false;
        }
        if (this.sangreMes != other.sangreMes) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabv1.models.SclHechoSangrePK[ idPaciente=" + idPaciente + ", idRangoEdad=" + idRangoEdad + ", idPais=" + idPais + ", idDepto=" + idDepto + ", idMunicipio=" + idMunicipio + ", idOrdenexamen=" + idOrdenexamen + ", idHematologia=" + idHematologia + ", sangreAnio=" + sangreAnio + ", sangreMes=" + sangreMes + " ]";
    }
    
}
