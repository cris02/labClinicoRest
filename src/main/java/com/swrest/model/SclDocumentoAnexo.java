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

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_documento_anexo", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_paciente", "id_documento"})})
@NamedQueries({
    @NamedQuery(name = "SclDocumentoAnexo.findAll", query = "SELECT s FROM SclDocumentoAnexo s")})
public class SclDocumentoAnexo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclDocumentoAnexoPK sclDocumentoAnexoPK;
    @Basic(optional = false)
    @Column(name = "documento", nullable = false, length = 2147483647)
    private String documento;
    @JsonIncludeProperties({"idClasanexo"})
    @JoinColumn(name = "id_clasanexo", referencedColumnName = "id_clasanexo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclClasificacionAnexo idClasanexo;
    @JsonIncludeProperties({"idPaciente"})
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclPaciente sclPaciente;

    public SclDocumentoAnexo() {
    }

    public SclDocumentoAnexo(SclDocumentoAnexoPK sclDocumentoAnexoPK) {
        this.sclDocumentoAnexoPK = sclDocumentoAnexoPK;
    }

    public SclDocumentoAnexo(SclDocumentoAnexoPK sclDocumentoAnexoPK, String documento) {
        this.sclDocumentoAnexoPK = sclDocumentoAnexoPK;
        this.documento = documento;
    }

    public SclDocumentoAnexo(int idPaciente, int idDocumento) {
        this.sclDocumentoAnexoPK = new SclDocumentoAnexoPK(idPaciente, idDocumento);
    }

    public SclDocumentoAnexoPK getSclDocumentoAnexoPK() {
        return sclDocumentoAnexoPK;
    }

    public void setSclDocumentoAnexoPK(SclDocumentoAnexoPK sclDocumentoAnexoPK) {
        this.sclDocumentoAnexoPK = sclDocumentoAnexoPK;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public SclClasificacionAnexo getIdClasanexo() {
        return idClasanexo;
    }

    public void setIdClasanexo(SclClasificacionAnexo idClasanexo) {
        this.idClasanexo = idClasanexo;
    }

    public SclPaciente getSclPaciente() {
        return sclPaciente;
    }

    public void setSclPaciente(SclPaciente sclPaciente) {
        this.sclPaciente = sclPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sclDocumentoAnexoPK != null ? sclDocumentoAnexoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclDocumentoAnexo)) {
            return false;
        }
        SclDocumentoAnexo other = (SclDocumentoAnexo) object;
        if ((this.sclDocumentoAnexoPK == null && other.sclDocumentoAnexoPK != null) || (this.sclDocumentoAnexoPK != null && !this.sclDocumentoAnexoPK.equals(other.sclDocumentoAnexoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclDocumentoAnexo[ sclDocumentoAnexoPK=" + sclDocumentoAnexoPK + " ]";
    }
    
}
