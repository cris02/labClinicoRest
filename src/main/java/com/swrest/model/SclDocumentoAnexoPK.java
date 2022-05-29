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
public class SclDocumentoAnexoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_paciente", nullable = false)
    private int idPaciente;
    @Basic(optional = false)
    @Column(name = "id_documento", nullable = false)
    private int idDocumento;

    public SclDocumentoAnexoPK() {
    }

    public SclDocumentoAnexoPK(int idPaciente, int idDocumento) {
        this.idPaciente = idPaciente;
        this.idDocumento = idDocumento;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPaciente;
        hash += (int) idDocumento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclDocumentoAnexoPK)) {
            return false;
        }
        SclDocumentoAnexoPK other = (SclDocumentoAnexoPK) object;
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if (this.idDocumento != other.idDocumento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclDocumentoAnexoPK[ idPaciente=" + idPaciente + ", idDocumento=" + idDocumento + " ]";
    }
    
}
