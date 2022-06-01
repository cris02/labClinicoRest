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
public class SclContactoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_tipocontacto", nullable = false)
    private int idTipocontacto;
    @Basic(optional = false)
    @Column(name = "id_paciente", nullable = false)
    private int idPaciente;
    @Basic(optional = false)
    @Column(name = "id_contacto", nullable = false)
    private int idContacto;

    public SclContactoPK() {
    }

    public SclContactoPK(int idTipocontacto, int idPaciente, int idContacto) {
        this.idTipocontacto = idTipocontacto;
        this.idPaciente = idPaciente;
        this.idContacto = idContacto;
    }

    public int getIdTipocontacto() {
        return idTipocontacto;
    }

    public void setIdTipocontacto(int idTipocontacto) {
        this.idTipocontacto = idTipocontacto;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTipocontacto;
        hash += (int) idPaciente;
        hash += (int) idContacto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclContactoPK)) {
            return false;
        }
        SclContactoPK other = (SclContactoPK) object;
        if (this.idTipocontacto != other.idTipocontacto) {
            return false;
        }
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if (this.idContacto != other.idContacto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclContactoPK[ idTipocontacto=" + idTipocontacto + ", idPaciente=" + idPaciente + ", idContacto=" + idContacto + " ]";
    }
    
}
