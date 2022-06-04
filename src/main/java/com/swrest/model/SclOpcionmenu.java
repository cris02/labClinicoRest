/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_opcionmenu", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_opcion"})})
@NamedQueries({
    @NamedQuery(name = "SclOpcionmenu.findAll", query = "SELECT s FROM SclOpcionmenu s")})
public class SclOpcionmenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_opcion", nullable = false)
    private Integer idOpcion;
    @Column(name = "id_opcionpadre", length = 30)
    private String idOpcionpadre;
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
    @JoinTable(name = "scl_opciondemenupor_rol", joinColumns = {
        @JoinColumn(name = "id_opcion", referencedColumnName = "id_opcion", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "id_rol", referencedColumnName = "id_rol", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<SclRol> sclRolList;

    public SclOpcionmenu() {
    }

    public SclOpcionmenu(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public SclOpcionmenu(Integer idOpcion, String nomOpcion, String url, String icon) {
        this.idOpcion = idOpcion;
        this.nomOpcion = nomOpcion;
        this.url = url;
        this.icon = icon;
    }

    public Integer getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public String getIdOpcionpadre() {
        return idOpcionpadre;
    }

    public void setIdOpcionpadre(String idOpcionpadre) {
        this.idOpcionpadre = idOpcionpadre;
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

    public List<SclRol> getSclRolList() {
        return sclRolList;
    }

    public void setSclRolList(List<SclRol> sclRolList) {
        this.sclRolList = sclRolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOpcion != null ? idOpcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclOpcionmenu)) {
            return false;
        }
        SclOpcionmenu other = (SclOpcionmenu) object;
        if ((this.idOpcion == null && other.idOpcion != null) || (this.idOpcion != null && !this.idOpcion.equals(other.idOpcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclOpcionmenu[ idOpcion=" + idOpcion + " ]";
    }
    
}
