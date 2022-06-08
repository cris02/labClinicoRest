/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_examenquimicaclinica", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_ordenexamen", "id_quimicaclinica"})})
@NamedQueries({
    @NamedQuery(name = "SclExamenquimicaclinica.findAll", query = "SELECT s FROM SclExamenquimicaclinica s")})
public class SclExamenquimicaclinica implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclExamenquimicaclinicaPK sclExamenquimicaclinicaPK;
    @Column(name = "glucosaquimica")
    private Integer glucosaquimica;
    @Basic(optional = false)
    @Column(name = "colesterol", nullable = false)
    private int colesterol;
    @Basic(optional = false)
    @Column(name = "trigliceridos", nullable = false)
    private int trigliceridos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "acido_urico", nullable = false, precision = 10, scale = 1)
    private BigDecimal acidoUrico;
    @Column(name = "usu_crea", length = 30)
    private String usuCrea;
    @Column(name = "usu_modi", length = 30)
    private String usuModi;
    @Column(name = "fec_crea")
    @Temporal(TemporalType.DATE)
    private Date fecCrea;
    @Column(name = "fec_modi")
    @Temporal(TemporalType.DATE)
    private Date fecModi;
    @JoinColumn(name = "id_ordenexamen", referencedColumnName = "id_ordenexamen", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclOrdendeexamen sclOrdendeexamen;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclUsuario idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclExamenquimicaclinica", fetch = FetchType.LAZY)
    private List<SclHechoEpidemiologia> sclHechoEpidemiologiaList;

    public SclExamenquimicaclinica() {
    }

    public SclExamenquimicaclinica(SclExamenquimicaclinicaPK sclExamenquimicaclinicaPK) {
        this.sclExamenquimicaclinicaPK = sclExamenquimicaclinicaPK;
    }

    public SclExamenquimicaclinica(SclExamenquimicaclinicaPK sclExamenquimicaclinicaPK, int colesterol, int trigliceridos, BigDecimal acidoUrico) {
        this.sclExamenquimicaclinicaPK = sclExamenquimicaclinicaPK;
        this.colesterol = colesterol;
        this.trigliceridos = trigliceridos;
        this.acidoUrico = acidoUrico;
    }

    public SclExamenquimicaclinica(int idOrdenexamen, int idQuimicaclinica) {
        this.sclExamenquimicaclinicaPK = new SclExamenquimicaclinicaPK(idOrdenexamen, idQuimicaclinica);
    }

    public SclExamenquimicaclinicaPK getSclExamenquimicaclinicaPK() {
        return sclExamenquimicaclinicaPK;
    }

    public void setSclExamenquimicaclinicaPK(SclExamenquimicaclinicaPK sclExamenquimicaclinicaPK) {
        this.sclExamenquimicaclinicaPK = sclExamenquimicaclinicaPK;
    }

    public Integer getGlucosaquimica() {
        return glucosaquimica;
    }

    public void setGlucosaquimica(Integer glucosaquimica) {
        this.glucosaquimica = glucosaquimica;
    }

    public int getColesterol() {
        return colesterol;
    }

    public void setColesterol(int colesterol) {
        this.colesterol = colesterol;
    }

    public int getTrigliceridos() {
        return trigliceridos;
    }

    public void setTrigliceridos(int trigliceridos) {
        this.trigliceridos = trigliceridos;
    }

    public BigDecimal getAcidoUrico() {
        return acidoUrico;
    }

    public void setAcidoUrico(BigDecimal acidoUrico) {
        this.acidoUrico = acidoUrico;
    }

    public String getUsuCrea() {
        return usuCrea;
    }

    public void setUsuCrea(String usuCrea) {
        this.usuCrea = usuCrea;
    }

    public String getUsuModi() {
        return usuModi;
    }

    public void setUsuModi(String usuModi) {
        this.usuModi = usuModi;
    }

    public Date getFecCrea() {
        return fecCrea;
    }

    public void setFecCrea(Date fecCrea) {
        this.fecCrea = fecCrea;
    }

    public Date getFecModi() {
        return fecModi;
    }

    public void setFecModi(Date fecModi) {
        this.fecModi = fecModi;
    }

    public SclOrdendeexamen getSclOrdendeexamen() {
        return sclOrdendeexamen;
    }

    public void setSclOrdendeexamen(SclOrdendeexamen sclOrdendeexamen) {
        this.sclOrdendeexamen = sclOrdendeexamen;
    }

    public SclUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(SclUsuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<SclHechoEpidemiologia> getSclHechoEpidemiologiaList() {
        return sclHechoEpidemiologiaList;
    }

    public void setSclHechoEpidemiologiaList(List<SclHechoEpidemiologia> sclHechoEpidemiologiaList) {
        this.sclHechoEpidemiologiaList = sclHechoEpidemiologiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sclExamenquimicaclinicaPK != null ? sclExamenquimicaclinicaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclExamenquimicaclinica)) {
            return false;
        }
        SclExamenquimicaclinica other = (SclExamenquimicaclinica) object;
        if ((this.sclExamenquimicaclinicaPK == null && other.sclExamenquimicaclinicaPK != null) || (this.sclExamenquimicaclinicaPK != null && !this.sclExamenquimicaclinicaPK.equals(other.sclExamenquimicaclinicaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabv1.models.SclExamenquimicaclinica[ sclExamenquimicaclinicaPK=" + sclExamenquimicaclinicaPK + " ]";
    }
    
}
