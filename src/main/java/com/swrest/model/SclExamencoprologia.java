/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_examencoprologia", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_ordenexamen", "id_corprologia"})})
@NamedQueries({
    @NamedQuery(name = "SclExamencoprologia.findAll", query = "SELECT s FROM SclExamencoprologia s")})
public class SclExamencoprologia implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclExamencoprologiaPK sclExamencoprologiaPK;
    @Basic(optional = false)
    @Column(name = "colorheces", nullable = false, length = 20)
    private String colorheces;
    @Basic(optional = false)
    @Column(name = "consistencia", nullable = false, length = 20)
    private String consistencia;
    @Basic(optional = false)
    @Column(name = "precenciademucus", nullable = false)
    private boolean precenciademucus;
    @Basic(optional = false)
    @Column(name = "sangre", nullable = false)
    private boolean sangre;
    @Basic(optional = false)
    @Column(name = "resto_alimenticio", nullable = false)
    private boolean restoAlimenticio;
    @Basic(optional = false)
    @Column(name = "parasitos_larvario", nullable = false)
    private boolean parasitosLarvario;
    @Column(name = "leucocitos")
    private Integer leucocitos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porc_polimorfonucleares", precision = 3, scale = 2)
    private BigDecimal porcPolimorfonucleares;
    @Column(name = "porc_mononucleares", precision = 3, scale = 2)
    private BigDecimal porcMononucleares;
    @Basic(optional = false)
    @Column(name = "parasitos_protozoario", nullable = false)
    private boolean parasitosProtozoario;
    @Basic(optional = false)
    @Column(name = "parasitos_metazoarios", nullable = false)
    private boolean parasitosMetazoarios;
    @Column(name = "eritrocitos", precision = 10, scale = 2)
    private BigDecimal eritrocitos;
    @Basic(optional = false)
    @Column(name = "levadura", nullable = false)
    private boolean levadura;
    @Basic(optional = false)
    @Column(name = "restosdegrasa", nullable = false)
    private boolean restosdegrasa;
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

    public SclExamencoprologia() {
    }

    public SclExamencoprologia(SclExamencoprologiaPK sclExamencoprologiaPK) {
        this.sclExamencoprologiaPK = sclExamencoprologiaPK;
    }

    public SclExamencoprologia(SclExamencoprologiaPK sclExamencoprologiaPK, String colorheces, String consistencia, boolean precenciademucus, boolean sangre, boolean restoAlimenticio, boolean parasitosLarvario, boolean parasitosProtozoario, boolean parasitosMetazoarios, boolean levadura, boolean restosdegrasa) {
        this.sclExamencoprologiaPK = sclExamencoprologiaPK;
        this.colorheces = colorheces;
        this.consistencia = consistencia;
        this.precenciademucus = precenciademucus;
        this.sangre = sangre;
        this.restoAlimenticio = restoAlimenticio;
        this.parasitosLarvario = parasitosLarvario;
        this.parasitosProtozoario = parasitosProtozoario;
        this.parasitosMetazoarios = parasitosMetazoarios;
        this.levadura = levadura;
        this.restosdegrasa = restosdegrasa;
    }

    public SclExamencoprologia(int idOrdenexamen, int idCorprologia) {
        this.sclExamencoprologiaPK = new SclExamencoprologiaPK(idOrdenexamen, idCorprologia);
    }

    public SclExamencoprologiaPK getSclExamencoprologiaPK() {
        return sclExamencoprologiaPK;
    }

    public void setSclExamencoprologiaPK(SclExamencoprologiaPK sclExamencoprologiaPK) {
        this.sclExamencoprologiaPK = sclExamencoprologiaPK;
    }

    public String getColorheces() {
        return colorheces;
    }

    public void setColorheces(String colorheces) {
        this.colorheces = colorheces;
    }

    public String getConsistencia() {
        return consistencia;
    }

    public void setConsistencia(String consistencia) {
        this.consistencia = consistencia;
    }

    public boolean getPrecenciademucus() {
        return precenciademucus;
    }

    public void setPrecenciademucus(boolean precenciademucus) {
        this.precenciademucus = precenciademucus;
    }

    public boolean getSangre() {
        return sangre;
    }

    public void setSangre(boolean sangre) {
        this.sangre = sangre;
    }

    public boolean getRestoAlimenticio() {
        return restoAlimenticio;
    }

    public void setRestoAlimenticio(boolean restoAlimenticio) {
        this.restoAlimenticio = restoAlimenticio;
    }

    public boolean getParasitosLarvario() {
        return parasitosLarvario;
    }

    public void setParasitosLarvario(boolean parasitosLarvario) {
        this.parasitosLarvario = parasitosLarvario;
    }

    public Integer getLeucocitos() {
        return leucocitos;
    }

    public void setLeucocitos(Integer leucocitos) {
        this.leucocitos = leucocitos;
    }

    public BigDecimal getPorcPolimorfonucleares() {
        return porcPolimorfonucleares;
    }

    public void setPorcPolimorfonucleares(BigDecimal porcPolimorfonucleares) {
        this.porcPolimorfonucleares = porcPolimorfonucleares;
    }

    public BigDecimal getPorcMononucleares() {
        return porcMononucleares;
    }

    public void setPorcMononucleares(BigDecimal porcMononucleares) {
        this.porcMononucleares = porcMononucleares;
    }

    public boolean getParasitosProtozoario() {
        return parasitosProtozoario;
    }

    public void setParasitosProtozoario(boolean parasitosProtozoario) {
        this.parasitosProtozoario = parasitosProtozoario;
    }

    public boolean getParasitosMetazoarios() {
        return parasitosMetazoarios;
    }

    public void setParasitosMetazoarios(boolean parasitosMetazoarios) {
        this.parasitosMetazoarios = parasitosMetazoarios;
    }

    public BigDecimal getEritrocitos() {
        return eritrocitos;
    }

    public void setEritrocitos(BigDecimal eritrocitos) {
        this.eritrocitos = eritrocitos;
    }

    public boolean getLevadura() {
        return levadura;
    }

    public void setLevadura(boolean levadura) {
        this.levadura = levadura;
    }

    public boolean getRestosdegrasa() {
        return restosdegrasa;
    }

    public void setRestosdegrasa(boolean restosdegrasa) {
        this.restosdegrasa = restosdegrasa;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sclExamencoprologiaPK != null ? sclExamencoprologiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclExamencoprologia)) {
            return false;
        }
        SclExamencoprologia other = (SclExamencoprologia) object;
        if ((this.sclExamencoprologiaPK == null && other.sclExamencoprologiaPK != null) || (this.sclExamencoprologiaPK != null && !this.sclExamencoprologiaPK.equals(other.sclExamencoprologiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclExamencoprologia[ sclExamencoprologiaPK=" + sclExamencoprologiaPK + " ]";
    }
    
}
