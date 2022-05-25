/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package persistencialab.entities;
package com.bad.labClinicoRest.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 *
 * @author crist
 */
@Embeddable
public class SclExamencoprologiaPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Basic(optional = false)
    @Column(name = "id_ordenexamen", nullable = false)
    private int idOrdenexamen;
    @Basic(optional = false)
    @Column(name = "id_corprologia", nullable = false)
    private int idCorprologia;

    public SclExamencoprologiaPK() {
    }

    public SclExamencoprologiaPK(int idOrdenexamen, int idCorprologia) {
        this.idOrdenexamen = idOrdenexamen;
        this.idCorprologia = idCorprologia;
    }

    public int getIdOrdenexamen() {
        return idOrdenexamen;
    }

    public void setIdOrdenexamen(int idOrdenexamen) {
        this.idOrdenexamen = idOrdenexamen;
    }

    public int getIdCorprologia() {
        return idCorprologia;
    }

    public void setIdCorprologia(int idCorprologia) {
        this.idCorprologia = idCorprologia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOrdenexamen;
        hash += (int) idCorprologia;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclExamencoprologiaPK)) {
            return false;
        }
        SclExamencoprologiaPK other = (SclExamencoprologiaPK) object;
        if (this.idOrdenexamen != other.idOrdenexamen) {
            return false;
        }
        if (this.idCorprologia != other.idCorprologia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclExamencoprologiaPK[ idOrdenexamen=" + idOrdenexamen + ", idCorprologia=" + idCorprologia + " ]";
    }
    
}
