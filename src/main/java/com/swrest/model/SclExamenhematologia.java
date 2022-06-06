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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "scl_examenhematologia", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_ordenexamen", "id_hematologia"})})
@NamedQueries({
    @NamedQuery(name = "SclExamenhematologia.findAll", query = "SELECT s FROM SclExamenhematologia s")})
public class SclExamenhematologia implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclExamenhematologiaPK sclExamenhematologiaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "leu_neu_segmentado", precision = 5, scale = 2)
    private BigDecimal leuNeuSegmentado;
    @Column(name = "leu_neu_banda", precision = 5, scale = 2)
    private BigDecimal leuNeuBanda;
    @Column(name = "leu_neu_linfocito", precision = 5, scale = 2)
    private BigDecimal leuNeuLinfocito;
    @Column(name = "leu_eosinofil", precision = 5, scale = 2)
    private BigDecimal leuEosinofil;
    @Column(name = "leu_basofilo", precision = 5, scale = 2)
    private BigDecimal leuBasofilo;
    @Column(name = "leu_monocito", precision = 5, scale = 2)
    private BigDecimal leuMonocito;
    @Column(name = "lr_anisocitosi", length = 30)
    private String lrAnisocitosi;
    @Column(name = "lr_poiquilocitosi", length = 30)
    private String lrPoiquilocitosi;
    @Column(name = "lr_hipocromia", length = 30)
    private String lrHipocromia;
    @Column(name = "lr_otro", length = 60)
    private String lrOtro;
    @Column(name = "lb_madurez_leu")
    private Boolean lbMadurezLeu;
    @Column(name = "lb_variante_leu")
    private Boolean lbVarianteLeu;
    @Column(name = "lb_alteracion")
    private Boolean lbAlteracion;
    @Column(name = "lp_cantidad")
    private Integer lpCantidad;
    @Column(name = "lp_tamano", precision = 5, scale = 2)
    private BigDecimal lpTamano;
    @Column(name = "porc_anemia", precision = 5, scale = 2)
    private BigDecimal porcAnemia;
    @Column(name = "porc_severidad", precision = 10, scale = 2)
    private BigDecimal porcSeveridad;
    @Column(name = "leucocito_sangre", precision = 10, scale = 2)
    private BigDecimal leucocitoSangre;
    @Column(name = "eritroblasto_sangre", precision = 10, scale = 2)
    private BigDecimal eritroblastoSangre;
    @Column(name = "recuento_pla_sangre", precision = 10, scale = 2)
    private BigDecimal recuentoPlaSangre;
    @Column(name = "grupo_a")
    private Boolean grupoA;
    @Column(name = "grupo_b")
    private Boolean grupoB;
    @Column(name = "grupo_o")
    private Boolean grupoO;
    @Column(name = "grupo_ab")
    private Boolean grupoAb;
    @Column(name = "du_positivo", length = 1)
    private String duPositivo;
    @Column(name = "du_negativo", length = 1)
    private String duNegativo;
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
    @JsonIncludeProperties({"idOrdenexamen"})
    @JoinColumn(name = "id_ordenexamen", referencedColumnName = "id_ordenexamen", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclOrdendeexamen sclOrdendeexamen;
    @JsonIncludeProperties({"idUsuario"})
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclUsuario idUsuario;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclExamenhematologia", fetch = FetchType.LAZY)
    private List<SclHechoSangre> sclHechoSangreList;

    public SclExamenhematologia() {
    }

    public SclExamenhematologia(SclExamenhematologiaPK sclExamenhematologiaPK) {
        this.sclExamenhematologiaPK = sclExamenhematologiaPK;
    }

    public SclExamenhematologia(int idOrdenexamen, int idHematologia) {
        this.sclExamenhematologiaPK = new SclExamenhematologiaPK(idOrdenexamen, idHematologia);
    }

    public SclExamenhematologiaPK getSclExamenhematologiaPK() {
        return sclExamenhematologiaPK;
    }

    public void setSclExamenhematologiaPK(SclExamenhematologiaPK sclExamenhematologiaPK) {
        this.sclExamenhematologiaPK = sclExamenhematologiaPK;
    }

    public BigDecimal getLeuNeuSegmentado() {
        return leuNeuSegmentado;
    }

    public void setLeuNeuSegmentado(BigDecimal leuNeuSegmentado) {
        this.leuNeuSegmentado = leuNeuSegmentado;
    }

    public BigDecimal getLeuNeuBanda() {
        return leuNeuBanda;
    }

    public void setLeuNeuBanda(BigDecimal leuNeuBanda) {
        this.leuNeuBanda = leuNeuBanda;
    }

    public BigDecimal getLeuNeuLinfocito() {
        return leuNeuLinfocito;
    }

    public void setLeuNeuLinfocito(BigDecimal leuNeuLinfocito) {
        this.leuNeuLinfocito = leuNeuLinfocito;
    }

    public BigDecimal getLeuEosinofil() {
        return leuEosinofil;
    }

    public void setLeuEosinofil(BigDecimal leuEosinofil) {
        this.leuEosinofil = leuEosinofil;
    }

    public BigDecimal getLeuBasofilo() {
        return leuBasofilo;
    }

    public void setLeuBasofilo(BigDecimal leuBasofilo) {
        this.leuBasofilo = leuBasofilo;
    }

    public BigDecimal getLeuMonocito() {
        return leuMonocito;
    }

    public void setLeuMonocito(BigDecimal leuMonocito) {
        this.leuMonocito = leuMonocito;
    }

    public String getLrAnisocitosi() {
        return lrAnisocitosi;
    }

    public void setLrAnisocitosi(String lrAnisocitosi) {
        this.lrAnisocitosi = lrAnisocitosi;
    }

    public String getLrPoiquilocitosi() {
        return lrPoiquilocitosi;
    }

    public void setLrPoiquilocitosi(String lrPoiquilocitosi) {
        this.lrPoiquilocitosi = lrPoiquilocitosi;
    }

    public String getLrHipocromia() {
        return lrHipocromia;
    }

    public void setLrHipocromia(String lrHipocromia) {
        this.lrHipocromia = lrHipocromia;
    }

    public String getLrOtro() {
        return lrOtro;
    }

    public void setLrOtro(String lrOtro) {
        this.lrOtro = lrOtro;
    }

    public Boolean getLbMadurezLeu() {
        return lbMadurezLeu;
    }

    public void setLbMadurezLeu(Boolean lbMadurezLeu) {
        this.lbMadurezLeu = lbMadurezLeu;
    }

    public Boolean getLbVarianteLeu() {
        return lbVarianteLeu;
    }

    public void setLbVarianteLeu(Boolean lbVarianteLeu) {
        this.lbVarianteLeu = lbVarianteLeu;
    }

    public Boolean getLbAlteracion() {
        return lbAlteracion;
    }

    public void setLbAlteracion(Boolean lbAlteracion) {
        this.lbAlteracion = lbAlteracion;
    }

    public Integer getLpCantidad() {
        return lpCantidad;
    }

    public void setLpCantidad(Integer lpCantidad) {
        this.lpCantidad = lpCantidad;
    }

    public BigDecimal getLpTamano() {
        return lpTamano;
    }

    public void setLpTamano(BigDecimal lpTamano) {
        this.lpTamano = lpTamano;
    }

    public BigDecimal getPorcAnemia() {
        return porcAnemia;
    }

    public void setPorcAnemia(BigDecimal porcAnemia) {
        this.porcAnemia = porcAnemia;
    }

    public BigDecimal getPorcSeveridad() {
        return porcSeveridad;
    }

    public void setPorcSeveridad(BigDecimal porcSeveridad) {
        this.porcSeveridad = porcSeveridad;
    }

    public BigDecimal getLeucocitoSangre() {
        return leucocitoSangre;
    }

    public void setLeucocitoSangre(BigDecimal leucocitoSangre) {
        this.leucocitoSangre = leucocitoSangre;
    }

    public BigDecimal getEritroblastoSangre() {
        return eritroblastoSangre;
    }

    public void setEritroblastoSangre(BigDecimal eritroblastoSangre) {
        this.eritroblastoSangre = eritroblastoSangre;
    }

    public BigDecimal getRecuentoPlaSangre() {
        return recuentoPlaSangre;
    }

    public void setRecuentoPlaSangre(BigDecimal recuentoPlaSangre) {
        this.recuentoPlaSangre = recuentoPlaSangre;
    }

    public Boolean getGrupoA() {
        return grupoA;
    }

    public void setGrupoA(Boolean grupoA) {
        this.grupoA = grupoA;
    }

    public Boolean getGrupoB() {
        return grupoB;
    }

    public void setGrupoB(Boolean grupoB) {
        this.grupoB = grupoB;
    }

    public Boolean getGrupoO() {
        return grupoO;
    }

    public void setGrupoO(Boolean grupoO) {
        this.grupoO = grupoO;
    }

    public Boolean getGrupoAb() {
        return grupoAb;
    }

    public void setGrupoAb(Boolean grupoAb) {
        this.grupoAb = grupoAb;
    }

    public String getDuPositivo() {
        return duPositivo;
    }

    public void setDuPositivo(String duPositivo) {
        this.duPositivo = duPositivo;
    }

    public String getDuNegativo() {
        return duNegativo;
    }

    public void setDuNegativo(String duNegativo) {
        this.duNegativo = duNegativo;
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

    public List<SclHechoSangre> getSclHechoSangreList() {
        return sclHechoSangreList;
    }

    public void setSclHechoSangreList(List<SclHechoSangre> sclHechoSangreList) {
        this.sclHechoSangreList = sclHechoSangreList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sclExamenhematologiaPK != null ? sclExamenhematologiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclExamenhematologia)) {
            return false;
        }
        SclExamenhematologia other = (SclExamenhematologia) object;
        if ((this.sclExamenhematologiaPK == null && other.sclExamenhematologiaPK != null) || (this.sclExamenhematologiaPK != null && !this.sclExamenhematologiaPK.equals(other.sclExamenhematologiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabclinico.entities.SclExamenhematologia[ sclExamenhematologiaPK=" + sclExamenhematologiaPK + " ]";
    }
    
}
