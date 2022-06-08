/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_contacto", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_tipocontacto", "id_paciente", "id_contacto"})})
@NamedQueries({
    @NamedQuery(name = "SclContacto.findAll", query = "SELECT s FROM SclContacto s")})
public class SclContacto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclContactoPK sclContactoPK;
    @Basic(optional = false)
    @Column(name = "contacto", nullable = false, length = 60)
    private String contacto;
    @Column(name = "comentario", length = 200)
    private String comentario;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclPaciente sclPaciente;
    @JoinColumn(name = "id_tipocontacto", referencedColumnName = "id_tipocontacto", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclTipoContacto sclTipoContacto;

    public SclContacto() {
    }

    public SclContacto(SclContactoPK sclContactoPK) {
        this.sclContactoPK = sclContactoPK;
    }

    public SclContacto(SclContactoPK sclContactoPK, String contacto) {
        this.sclContactoPK = sclContactoPK;
        this.contacto = contacto;
    }

    public SclContacto(int idTipocontacto, int idPaciente, int idContacto) {
        this.sclContactoPK = new SclContactoPK(idTipocontacto, idPaciente, idContacto);
    }

    public SclContactoPK getSclContactoPK() {
        return sclContactoPK;
    }

    public void setSclContactoPK(SclContactoPK sclContactoPK) {
        this.sclContactoPK = sclContactoPK;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public SclPaciente getSclPaciente() {
        return sclPaciente;
    }

    public void setSclPaciente(SclPaciente sclPaciente) {
        this.sclPaciente = sclPaciente;
    }

    public SclTipoContacto getSclTipoContacto() {
        return sclTipoContacto;
    }

    public void setSclTipoContacto(SclTipoContacto sclTipoContacto) {
        this.sclTipoContacto = sclTipoContacto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sclContactoPK != null ? sclContactoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclContacto)) {
            return false;
        }
        SclContacto other = (SclContacto) object;
        if ((this.sclContactoPK == null && other.sclContactoPK != null) || (this.sclContactoPK != null && !this.sclContactoPK.equals(other.sclContactoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabv1.models.SclContacto[ sclContactoPK=" + sclContactoPK + " ]";
    }
    
}
