/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package persistencialab.entities;
package com.bad.labClinicoRest.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_rol", catalog = "labclinicodb", schema = "UESBAD", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_rol"})})
@NamedQueries({
    @NamedQuery(name = "SclRol.findAll", query = "SELECT s FROM SclRol s")})
public class SclRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_rol", nullable = false, length = 30)
    private String idRol;
    @Basic(optional = false)
    @Column(name = "desc_rol", nullable = false, length = 60)
    private String descRol;
    @Basic(optional = false)
    @Column(name = "usu_crea", nullable = false, length = 30)
    private String usuCrea;
    @Column(name = "usu_modi", length = 30)
    private String usuModi;
    @Basic(optional = false)
    @Column(name = "fec_crea2", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecCrea2;
    @Column(name = "fec_modi2")
    @Temporal(TemporalType.DATE)
    private Date fecModi2;

    public SclRol() {
    }

    public SclRol(String idRol) {
        this.idRol = idRol;
    }

    public SclRol(String idRol, String descRol, String usuCrea, Date fecCrea2) {
        this.idRol = idRol;
        this.descRol = descRol;
        this.usuCrea = usuCrea;
        this.fecCrea2 = fecCrea2;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getDescRol() {
        return descRol;
    }

    public void setDescRol(String descRol) {
        this.descRol = descRol;
    }

    public String getUsuCrea() {
        return usuCrea;
    }

    public void setUsuCrea(String usuCrea) {
        this.usuCrea = usuCrea;
    }

    public String getUsuModi() {
        return usuModi;
    }

    public void setUsuModi(String usuModi) {
        this.usuModi = usuModi;
    }

    public Date getFecCrea2() {
        return fecCrea2;
    }

    public void setFecCrea2(Date fecCrea2) {
        this.fecCrea2 = fecCrea2;
    }

    public Date getFecModi2() {
        return fecModi2;
    }

    public void setFecModi2(Date fecModi2) {
        this.fecModi2 = fecModi2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclRol)) {
            return false;
        }
        SclRol other = (SclRol) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclRol[ idRol=" + idRol + " ]";
    }
    
}
