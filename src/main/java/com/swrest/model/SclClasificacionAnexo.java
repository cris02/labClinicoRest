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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "scl_clasificacion_anexo", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_clasanexo"})})
@NamedQueries({
    @NamedQuery(name = "SclClasificacionAnexo.findAll", query = "SELECT s FROM SclClasificacionAnexo s")})
public class SclClasificacionAnexo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_clasanexo", nullable = false)
    private Integer idClasanexo;
    @Basic(optional = false)
    @Column(name = "clasificacion", nullable = false, length = 50)
    private String clasificacion;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClasanexo", fetch = FetchType.LAZY)
    private List<SclDocumentoAnexo> sclDocumentoAnexoList;

    public SclClasificacionAnexo() {
    }

    public SclClasificacionAnexo(Integer idClasanexo) {
        this.idClasanexo = idClasanexo;
    }

    public SclClasificacionAnexo(Integer idClasanexo, String clasificacion) {
        this.idClasanexo = idClasanexo;
        this.clasificacion = clasificacion;
    }

    public Integer getIdClasanexo() {
        return idClasanexo;
    }

    public void setIdClasanexo(Integer idClasanexo) {
        this.idClasanexo = idClasanexo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public List<SclDocumentoAnexo> getSclDocumentoAnexoList() {
        return sclDocumentoAnexoList;
    }

    public void setSclDocumentoAnexoList(List<SclDocumentoAnexo> sclDocumentoAnexoList) {
        this.sclDocumentoAnexoList = sclDocumentoAnexoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClasanexo != null ? idClasanexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclClasificacionAnexo)) {
            return false;
        }
        SclClasificacionAnexo other = (SclClasificacionAnexo) object;
        if ((this.idClasanexo == null && other.idClasanexo != null) || (this.idClasanexo != null && !this.idClasanexo.equals(other.idClasanexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclClasificacionAnexo[ idClasanexo=" + idClasanexo + " ]";
    }
    
}
