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
public class SclExamenurianalisisPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_ordenexamen", nullable = false)
    private int idOrdenexamen;
    @Basic(optional = false)
    @Column(name = "id_examenurianalisis", nullable = false)
    private int idExamenurianalisis;

    public SclExamenurianalisisPK() {
    }

    public SclExamenurianalisisPK(int idOrdenexamen, int idExamenurianalisis) {
        this.idOrdenexamen = idOrdenexamen;
        this.idExamenurianalisis = idExamenurianalisis;
    }

    public int getIdOrdenexamen() {
        return idOrdenexamen;
    }

    public void setIdOrdenexamen(int idOrdenexamen) {
        this.idOrdenexamen = idOrdenexamen;
    }

    public int getIdExamenurianalisis() {
        return idExamenurianalisis;
    }

    public void setIdExamenurianalisis(int idExamenurianalisis) {
        this.idExamenurianalisis = idExamenurianalisis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOrdenexamen;
        hash += (int) idExamenurianalisis;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclExamenurianalisisPK)) {
            return false;
        }
        SclExamenurianalisisPK other = (SclExamenurianalisisPK) object;
        if (this.idOrdenexamen != other.idOrdenexamen) {
            return false;
        }
        if (this.idExamenurianalisis != other.idExamenurianalisis) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclExamenurianalisisPK[ idOrdenexamen=" + idOrdenexamen + ", idExamenurianalisis=" + idExamenurianalisis + " ]";
    }
    
}
