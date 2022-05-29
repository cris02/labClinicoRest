/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package persistencialab.entities;
package com.swrest.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_departamento", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_pais", "id_depto"})})
@NamedQueries({
    @NamedQuery(name = "SclDepartamento.findAll", query = "SELECT s FROM SclDepartamento s")})
public class SclDepartamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclDepartamentoPK sclDepartamentoPK;
    @Basic(optional = false)
    @Column(name = "nom_depto", nullable = false, length = 25)
    private String nomDepto;
    @Basic(optional = false)
    @Column(name = "cod_iso", nullable = false, length = 3)
    private String codIso;
    @JoinColumn(name = "id_pais", referencedColumnName = "id_pais", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclPais sclPais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclDepartamento", fetch = FetchType.LAZY)
    private List<SclMunicipio> sclMunicipioList;

    public SclDepartamento() {
    }

    public SclDepartamento(SclDepartamentoPK sclDepartamentoPK) {
        this.sclDepartamentoPK = sclDepartamentoPK;
    }

    public SclDepartamento(SclDepartamentoPK sclDepartamentoPK, String nomDepto, String codIso) {
        this.sclDepartamentoPK = sclDepartamentoPK;
        this.nomDepto = nomDepto;
        this.codIso = codIso;
    }

    public SclDepartamento(String idPais, int idDepto) {
        this.sclDepartamentoPK = new SclDepartamentoPK(idPais, idDepto);
    }

    public SclDepartamentoPK getSclDepartamentoPK() {
        return sclDepartamentoPK;
    }

    public void setSclDepartamentoPK(SclDepartamentoPK sclDepartamentoPK) {
        this.sclDepartamentoPK = sclDepartamentoPK;
    }

    public String getNomDepto() {
        return nomDepto;
    }

    public void setNomDepto(String nomDepto) {
        this.nomDepto = nomDepto;
    }

    public String getCodIso() {
        return codIso;
    }

    public void setCodIso(String codIso) {
        this.codIso = codIso;
    }

    public SclPais getSclPais() {
        return sclPais;
    }

    public void setSclPais(SclPais sclPais) {
        this.sclPais = sclPais;
    }

    public List<SclMunicipio> getSclMunicipioList() {
        return sclMunicipioList;
    }

    public void setSclMunicipioList(List<SclMunicipio> sclMunicipioList) {
        this.sclMunicipioList = sclMunicipioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sclDepartamentoPK != null ? sclDepartamentoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclDepartamento)) {
            return false;
        }
        SclDepartamento other = (SclDepartamento) object;
        if ((this.sclDepartamentoPK == null && other.sclDepartamentoPK != null) || (this.sclDepartamentoPK != null && !this.sclDepartamentoPK.equals(other.sclDepartamentoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclDepartamento[ sclDepartamentoPK=" + sclDepartamentoPK + " ]";
    }
    
}
