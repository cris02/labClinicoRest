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
public class SclExamenhematologiaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_ordenexamen", nullable = false)
    private int idOrdenexamen;
    @Basic(optional = false)
    @Column(name = "id_hematologia", nullable = false)
    private int idHematologia;

    public SclExamenhematologiaPK() {
    }

    public SclExamenhematologiaPK(int idOrdenexamen, int idHematologia) {
        this.idOrdenexamen = idOrdenexamen;
        this.idHematologia = idHematologia;
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
        hash += (int) idOrdenexamen;
        hash += (int) idHematologia;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclExamenhematologiaPK)) {
            return false;
        }
        SclExamenhematologiaPK other = (SclExamenhematologiaPK) object;
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
        return "persistencialabv1.models.SclExamenhematologiaPK[ idOrdenexamen=" + idOrdenexamen + ", idHematologia=" + idHematologia + " ]";
    }
    
}
