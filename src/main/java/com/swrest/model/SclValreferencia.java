/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "scl_valreferencia", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_valreferencia"})})
@NamedQueries({
    @NamedQuery(name = "SclValreferencia.findAll", query = "SELECT s FROM SclValreferencia s")})
public class SclValreferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_valreferencia", nullable = false)
    private Integer idValreferencia;
    @Basic(optional = false)
    @Column(name = "tipo_reporte", nullable = false, length = 10)
    private String tipoReporte;
    @Basic(optional = false)
    @Column(name = "cod_ref", nullable = false, length = 20)
    private String codRef;
    @Basic(optional = false)
    @Column(name = "nom_ref", nullable = false, length = 20)
    private String nomRef;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "minimo", precision = 10, scale = 2)
    private BigDecimal minimo;
    @Column(name = "maximo", precision = 10, scale = 2)
    private BigDecimal maximo;
    @Column(name = "cant_examenes")
    private Integer cantExamenes;
    @Column(name = "unidad_medida", length = 25)
    private String unidadMedida;

    public SclValreferencia() {
    }

    public SclValreferencia(Integer idValreferencia) {
        this.idValreferencia = idValreferencia;
    }

    public SclValreferencia(Integer idValreferencia, String tipoReporte, String codRef, String nomRef) {
        this.idValreferencia = idValreferencia;
        this.tipoReporte = tipoReporte;
        this.codRef = codRef;
        this.nomRef = nomRef;
    }

    public Integer getIdValreferencia() {
        return idValreferencia;
    }

    public void setIdValreferencia(Integer idValreferencia) {
        this.idValreferencia = idValreferencia;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public String getCodRef() {
        return codRef;
    }

    public void setCodRef(String codRef) {
        this.codRef = codRef;
    }

    public String getNomRef() {
        return nomRef;
    }

    public void setNomRef(String nomRef) {
        this.nomRef = nomRef;
    }

    public BigDecimal getMinimo() {
        return minimo;
    }

    public void setMinimo(BigDecimal minimo) {
        this.minimo = minimo;
    }

    public BigDecimal getMaximo() {
        return maximo;
    }

    public void setMaximo(BigDecimal maximo) {
        this.maximo = maximo;
    }

    public Integer getCantExamenes() {
        return cantExamenes;
    }

    public void setCantExamenes(Integer cantExamenes) {
        this.cantExamenes = cantExamenes;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idValreferencia != null ? idValreferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclValreferencia)) {
            return false;
        }
        SclValreferencia other = (SclValreferencia) object;
        if ((this.idValreferencia == null && other.idValreferencia != null) || (this.idValreferencia != null && !this.idValreferencia.equals(other.idValreferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclValreferencia[ idValreferencia=" + idValreferencia + " ]";
    }
    
}
