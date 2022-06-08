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
@Table(name = "scl_tipo_contacto", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_tipocontacto"})})
@NamedQueries({
    @NamedQuery(name = "SclTipoContacto.findAll", query = "SELECT s FROM SclTipoContacto s")})
public class SclTipoContacto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipocontacto", nullable = false)
    private Integer idTipocontacto;
    @Basic(optional = false)
    @Column(name = "descripcion_contacto", nullable = false, length = 10)
    private String descripcionContacto;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclTipoContacto", fetch = FetchType.LAZY)
    private List<SclContacto> sclContactoList;

    public SclTipoContacto() {
    }

    public SclTipoContacto(Integer idTipocontacto) {
        this.idTipocontacto = idTipocontacto;
    }

    public SclTipoContacto(Integer idTipocontacto, String descripcionContacto) {
        this.idTipocontacto = idTipocontacto;
        this.descripcionContacto = descripcionContacto;
    }

    public Integer getIdTipocontacto() {
        return idTipocontacto;
    }

    public void setIdTipocontacto(Integer idTipocontacto) {
        this.idTipocontacto = idTipocontacto;
    }

    public String getDescripcionContacto() {
        return descripcionContacto;
    }

    public void setDescripcionContacto(String descripcionContacto) {
        this.descripcionContacto = descripcionContacto;
    }

    public List<SclContacto> getSclContactoList() {
        return sclContactoList;
    }

    public void setSclContactoList(List<SclContacto> sclContactoList) {
        this.sclContactoList = sclContactoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipocontacto != null ? idTipocontacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclTipoContacto)) {
            return false;
        }
        SclTipoContacto other = (SclTipoContacto) object;
        if ((this.idTipocontacto == null && other.idTipocontacto != null) || (this.idTipocontacto != null && !this.idTipocontacto.equals(other.idTipocontacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabv1.models.SclTipoContacto[ idTipocontacto=" + idTipocontacto + " ]";
    }
    
}
