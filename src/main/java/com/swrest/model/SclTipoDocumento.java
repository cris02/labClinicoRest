/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_tipo_documento", catalog = "labclinicodb", schema = "UESBAD", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_tipo_documento"})})
@NamedQueries({
    @NamedQuery(name = "SclTipoDocumento.findAll", query = "SELECT s FROM SclTipoDocumento s")})
public class SclTipoDocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_documento", nullable = false, precision = 131089, scale = 0)
    private BigDecimal idTipoDocumento;
    @Basic(optional = false)
    @Column(name = "documento", nullable = false, length = 50)
    private String documento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoDocumento", fetch = FetchType.LAZY)
    private List<SclPaciente> sclPacienteList;

    public SclTipoDocumento() {
    }

    public SclTipoDocumento(BigDecimal idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public SclTipoDocumento(BigDecimal idTipoDocumento, String documento) {
        this.idTipoDocumento = idTipoDocumento;
        this.documento = documento;
    }

    public BigDecimal getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(BigDecimal idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<SclPaciente> getSclPacienteList() {
        return sclPacienteList;
    }

    public void setSclPacienteList(List<SclPaciente> sclPacienteList) {
        this.sclPacienteList = sclPacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDocumento != null ? idTipoDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclTipoDocumento)) {
            return false;
        }
        SclTipoDocumento other = (SclTipoDocumento) object;
        if ((this.idTipoDocumento == null && other.idTipoDocumento != null) || (this.idTipoDocumento != null && !this.idTipoDocumento.equals(other.idTipoDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclTipoDocumento[ idTipoDocumento=" + idTipoDocumento + " ]";
    }
    
}
