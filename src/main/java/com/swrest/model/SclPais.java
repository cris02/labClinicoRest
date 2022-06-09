/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_pais", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_pais"})})
@NamedQueries({
    @NamedQuery(name = "SclPais.findAll", query = "SELECT s FROM SclPais s")})
public class SclPais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pais", nullable = false, length = 3)
    private String idPais;
    @Basic(optional = false)
    @Column(name = "nom_pais", nullable = false, length = 50)
    private String nomPais;
    @Basic(optional = false)
    @Column(name = "id_iso2", nullable = false, length = 2)
    private String idIso2;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclPais", fetch = FetchType.LAZY)
    private List<SclDepartamento> sclDepartamentoList;

    public SclPais() {
    }

    public SclPais(String idPais) {
        this.idPais = idPais;
    }

    public SclPais(String idPais, String nomPais, String idIso2) {
        this.idPais = idPais;
        this.nomPais = nomPais;
        this.idIso2 = idIso2;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }

    public String getIdIso2() {
        return idIso2;
    }

    public void setIdIso2(String idIso2) {
        this.idIso2 = idIso2;
    }

    public List<SclDepartamento> getSclDepartamentoList() {
        return sclDepartamentoList;
    }

    public void setSclDepartamentoList(List<SclDepartamento> sclDepartamentoList) {
        this.sclDepartamentoList = sclDepartamentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPais != null ? idPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclPais)) {
            return false;
        }
        SclPais other = (SclPais) object;
        if ((this.idPais == null && other.idPais != null) || (this.idPais != null && !this.idPais.equals(other.idPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabv1.models.SclPais[ idPais=" + idPais + " ]";
    }
    
}
