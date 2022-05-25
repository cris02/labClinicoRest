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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_opcionmenu", catalog = "labclinicodb", schema = "UESBAD", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_opci"})})
@NamedQueries({
    @NamedQuery(name = "SclOpcionmenu.findAll", query = "SELECT s FROM SclOpcionmenu s")})
public class SclOpcionmenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_opci", nullable = false, length = 30)
    private String idOpci;
    @Basic(optional = false)
    @Column(name = "nom_opcion", nullable = false, length = 30)
    private String nomOpcion;
    @Basic(optional = false)
    @Column(name = "url", nullable = false, length = 60)
    private String url;
    @Basic(optional = false)
    @Column(name = "icon", nullable = false, length = 60)
    private String icon;
    @Column(name = "parametros", length = 60)
    private String parametros;

    public SclOpcionmenu() {
    }

    public SclOpcionmenu(String idOpci) {
        this.idOpci = idOpci;
    }

    public SclOpcionmenu(String idOpci, String nomOpcion, String url, String icon) {
        this.idOpci = idOpci;
        this.nomOpcion = nomOpcion;
        this.url = url;
        this.icon = icon;
    }

    public String getIdOpci() {
        return idOpci;
    }

    public void setIdOpci(String idOpci) {
        this.idOpci = idOpci;
    }

    public String getNomOpcion() {
        return nomOpcion;
    }

    public void setNomOpcion(String nomOpcion) {
        this.nomOpcion = nomOpcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOpci != null ? idOpci.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclOpcionmenu)) {
            return false;
        }
        SclOpcionmenu other = (SclOpcionmenu) object;
        if ((this.idOpci == null && other.idOpci != null) || (this.idOpci != null && !this.idOpci.equals(other.idOpci))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclOpcionmenu[ idOpci=" + idOpci + " ]";
    }
    
}
