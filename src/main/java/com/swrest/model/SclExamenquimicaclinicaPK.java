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
public class SclExamenquimicaclinicaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_ordenexamen", nullable = false)
    private int idOrdenexamen;
    @Basic(optional = false)
    @Column(name = "id_quimicaclinica", nullable = false)
    private int idQuimicaclinica;

    public SclExamenquimicaclinicaPK() {
    }

    public SclExamenquimicaclinicaPK(int idOrdenexamen, int idQuimicaclinica) {
        this.idOrdenexamen = idOrdenexamen;
        this.idQuimicaclinica = idQuimicaclinica;
    }

    public int getIdOrdenexamen() {
        return idOrdenexamen;
    }

    public void setIdOrdenexamen(int idOrdenexamen) {
        this.idOrdenexamen = idOrdenexamen;
    }

    public int getIdQuimicaclinica() {
        return idQuimicaclinica;
    }

    public void setIdQuimicaclinica(int idQuimicaclinica) {
        this.idQuimicaclinica = idQuimicaclinica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOrdenexamen;
        hash += (int) idQuimicaclinica;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclExamenquimicaclinicaPK)) {
            return false;
        }
        SclExamenquimicaclinicaPK other = (SclExamenquimicaclinicaPK) object;
        if (this.idOrdenexamen != other.idOrdenexamen) {
            return false;
        }
        if (this.idQuimicaclinica != other.idQuimicaclinica) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclExamenquimicaclinicaPK[ idOrdenexamen=" + idOrdenexamen + ", idQuimicaclinica=" + idQuimicaclinica + " ]";
    }
    
}
