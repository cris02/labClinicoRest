/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package persistencialab.entities;
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
@Table(name = "scl_examenurianalisis", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_ordenexamen", "id_examenurianalisis"})})
@NamedQueries({
    @NamedQuery(name = "SclExamenurianalisis.findAll", query = "SELECT s FROM SclExamenurianalisis s")})
public class SclExamenurianalisis implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SclExamenurianalisisPK sclExamenurianalisisPK;
    @Basic(optional = false)
    @Column(name = "coloro", nullable = false, length = 20)
    private String coloro;
    @Basic(optional = false)
    @Column(name = "aspecto", nullable = false, length = 20)
    private String aspecto;
    @Basic(optional = false)
    @Column(name = "ph_inf", nullable = false)
    private int phInf;
    @Column(name = "ph_sup")
    private Integer phSup;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "densidad_inf", nullable = false, precision = 10, scale = 3)
    private BigDecimal densidadInf;
    @Column(name = "densidad_sup", precision = 10, scale = 3)
    private BigDecimal densidadSup;
    @Basic(optional = false)
    @Column(name = "leucocitos", nullable = false)
    private int leucocitos;
    @Basic(optional = false)
    @Column(name = "nitritos", nullable = false)
    private boolean nitritos;
    @Basic(optional = false)
    @Column(name = "proteina", nullable = false)
    private int proteina;
    @Basic(optional = false)
    @Column(name = "glucosa", nullable = false)
    private int glucosa;
    @Basic(optional = false)
    @Column(name = "cuerpos_cetonicos", nullable = false, length = 20)
    private String cuerposCetonicos;
    @Basic(optional = false)
    @Column(name = "urubilinogeno", nullable = false)
    private int urubilinogeno;
    @Basic(optional = false)
    @Column(name = "bilirrubina", nullable = false, length = 20)
    private String bilirrubina;
    @Basic(optional = false)
    @Column(name = "hemoglobina", nullable = false)
    private int hemoglobina;
    @Column(name = "cel_epiteliales_esca", length = 30)
    private String celEpitelialesEsca;
    @Column(name = "cel_epiteliales_red", length = 30)
    private String celEpitelialesRed;
    @Basic(optional = false)
    @Column(name = "globulos_rojos", nullable = false, precision = 10, scale = 2)
    private BigDecimal globulosRojos;
    @Basic(optional = false)
    @Column(name = "leucocitosporcampo", nullable = false)
    private int leucocitosporcampo;
    @Column(name = "cilindros")
    private Integer cilindros;
    @Basic(optional = false)
    @Column(name = "filamentos_mucoides", nullable = false, length = 30)
    private String filamentosMucoides;
    @Column(name = "cristales", length = 30)
    private String cristales;
    @Column(name = "cris_oxalato")
    private Boolean crisOxalato;
    @Column(name = "cris_acido_uri")
    private Boolean crisAcidoUri;
    @Column(name = "cris_urato_amorfo")
    private Boolean crisUratoAmorfo;
    @Column(name = "cris_fos_amorfo")
    private Boolean crisFosAmorfo;
    @Column(name = "cris_fos_triple")
    private Boolean crisFosTriple;
    @Column(name = "cris_urato_amo")
    private Boolean crisUratoAmo;
    @Column(name = "cris_leucina")
    private Boolean crisLeucina;
    @Column(name = "cris_cistina")
    private Boolean crisCistina;
    @Column(name = "cris_tirosina")
    private Boolean crisTirosina;
    @Basic(optional = false)
    @Column(name = "levadura", nullable = false)
    private boolean levadura;
    @Column(name = "parasito_trichomona")
    private Boolean parasitoTrichomona;
    @Column(name = "parasito_phitirus")
    private Boolean parasitoPhitirus;
    @Column(name = "parasito_huevo")
    private Boolean parasitoHuevo;
    @Column(name = "parasito_quiste")
    private Boolean parasitoQuiste;
    @Basic(optional = false)
    @Column(name = "filamento_bacteria", nullable = false, length = 30)
    private String filamentoBacteria;
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

    public SclExamenurianalisis() {
    }

    public SclExamenurianalisis(SclExamenurianalisisPK sclExamenurianalisisPK) {
        this.sclExamenurianalisisPK = sclExamenurianalisisPK;
    }

    public SclExamenurianalisis(SclExamenurianalisisPK sclExamenurianalisisPK, String coloro, String aspecto, int phInf, BigDecimal densidadInf, int leucocitos, boolean nitritos, int proteina, int glucosa, String cuerposCetonicos, int urubilinogeno, String bilirrubina, int hemoglobina, BigDecimal globulosRojos, int leucocitosporcampo, String filamentosMucoides, boolean levadura, String filamentoBacteria) {
        this.sclExamenurianalisisPK = sclExamenurianalisisPK;
        this.coloro = coloro;
        this.aspecto = aspecto;
        this.phInf = phInf;
        this.densidadInf = densidadInf;
        this.leucocitos = leucocitos;
        this.nitritos = nitritos;
        this.proteina = proteina;
        this.glucosa = glucosa;
        this.cuerposCetonicos = cuerposCetonicos;
        this.urubilinogeno = urubilinogeno;
        this.bilirrubina = bilirrubina;
        this.hemoglobina = hemoglobina;
        this.globulosRojos = globulosRojos;
        this.leucocitosporcampo = leucocitosporcampo;
        this.filamentosMucoides = filamentosMucoides;
        this.levadura = levadura;
        this.filamentoBacteria = filamentoBacteria;
    }

    public SclExamenurianalisis(int idOrdenexamen, int idExamenurianalisis) {
        this.sclExamenurianalisisPK = new SclExamenurianalisisPK(idOrdenexamen, idExamenurianalisis);
    }

    public SclExamenurianalisisPK getSclExamenurianalisisPK() {
        return sclExamenurianalisisPK;
    }

    public void setSclExamenurianalisisPK(SclExamenurianalisisPK sclExamenurianalisisPK) {
        this.sclExamenurianalisisPK = sclExamenurianalisisPK;
    }

    public String getColoro() {
        return coloro;
    }

    public void setColoro(String coloro) {
        this.coloro = coloro;
    }

    public String getAspecto() {
        return aspecto;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public int getPhInf() {
        return phInf;
    }

    public void setPhInf(int phInf) {
        this.phInf = phInf;
    }

    public Integer getPhSup() {
        return phSup;
    }

    public void setPhSup(Integer phSup) {
        this.phSup = phSup;
    }

    public BigDecimal getDensidadInf() {
        return densidadInf;
    }

    public void setDensidadInf(BigDecimal densidadInf) {
        this.densidadInf = densidadInf;
    }

    public BigDecimal getDensidadSup() {
        return densidadSup;
    }

    public void setDensidadSup(BigDecimal densidadSup) {
        this.densidadSup = densidadSup;
    }

    public int getLeucocitos() {
        return leucocitos;
    }

    public void setLeucocitos(int leucocitos) {
        this.leucocitos = leucocitos;
    }

    public boolean getNitritos() {
        return nitritos;
    }

    public void setNitritos(boolean nitritos) {
        this.nitritos = nitritos;
    }

    public int getProteina() {
        return proteina;
    }

    public void setProteina(int proteina) {
        this.proteina = proteina;
    }

    public int getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(int glucosa) {
        this.glucosa = glucosa;
    }

    public String getCuerposCetonicos() {
        return cuerposCetonicos;
    }

    public void setCuerposCetonicos(String cuerposCetonicos) {
        this.cuerposCetonicos = cuerposCetonicos;
    }

    public int getUrubilinogeno() {
        return urubilinogeno;
    }

    public void setUrubilinogeno(int urubilinogeno) {
        this.urubilinogeno = urubilinogeno;
    }

    public String getBilirrubina() {
        return bilirrubina;
    }

    public void setBilirrubina(String bilirrubina) {
        this.bilirrubina = bilirrubina;
    }

    public int getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(int hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public String getCelEpitelialesEsca() {
        return celEpitelialesEsca;
    }

    public void setCelEpitelialesEsca(String celEpitelialesEsca) {
        this.celEpitelialesEsca = celEpitelialesEsca;
    }

    public String getCelEpitelialesRed() {
        return celEpitelialesRed;
    }

    public void setCelEpitelialesRed(String celEpitelialesRed) {
        this.celEpitelialesRed = celEpitelialesRed;
    }

    public BigDecimal getGlobulosRojos() {
        return globulosRojos;
    }

    public void setGlobulosRojos(BigDecimal globulosRojos) {
        this.globulosRojos = globulosRojos;
    }

    public int getLeucocitosporcampo() {
        return leucocitosporcampo;
    }

    public void setLeucocitosporcampo(int leucocitosporcampo) {
        this.leucocitosporcampo = leucocitosporcampo;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public String getFilamentosMucoides() {
        return filamentosMucoides;
    }

    public void setFilamentosMucoides(String filamentosMucoides) {
        this.filamentosMucoides = filamentosMucoides;
    }

    public String getCristales() {
        return cristales;
    }

    public void setCristales(String cristales) {
        this.cristales = cristales;
    }

    public Boolean getCrisOxalato() {
        return crisOxalato;
    }

    public void setCrisOxalato(Boolean crisOxalato) {
        this.crisOxalato = crisOxalato;
    }

    public Boolean getCrisAcidoUri() {
        return crisAcidoUri;
    }

    public void setCrisAcidoUri(Boolean crisAcidoUri) {
        this.crisAcidoUri = crisAcidoUri;
    }

    public Boolean getCrisUratoAmorfo() {
        return crisUratoAmorfo;
    }

    public void setCrisUratoAmorfo(Boolean crisUratoAmorfo) {
        this.crisUratoAmorfo = crisUratoAmorfo;
    }

    public Boolean getCrisFosAmorfo() {
        return crisFosAmorfo;
    }

    public void setCrisFosAmorfo(Boolean crisFosAmorfo) {
        this.crisFosAmorfo = crisFosAmorfo;
    }

    public Boolean getCrisFosTriple() {
        return crisFosTriple;
    }

    public void setCrisFosTriple(Boolean crisFosTriple) {
        this.crisFosTriple = crisFosTriple;
    }

    public Boolean getCrisUratoAmo() {
        return crisUratoAmo;
    }

    public void setCrisUratoAmo(Boolean crisUratoAmo) {
        this.crisUratoAmo = crisUratoAmo;
    }

    public Boolean getCrisLeucina() {
        return crisLeucina;
    }

    public void setCrisLeucina(Boolean crisLeucina) {
        this.crisLeucina = crisLeucina;
    }

    public Boolean getCrisCistina() {
        return crisCistina;
    }

    public void setCrisCistina(Boolean crisCistina) {
        this.crisCistina = crisCistina;
    }

    public Boolean getCrisTirosina() {
        return crisTirosina;
    }

    public void setCrisTirosina(Boolean crisTirosina) {
        this.crisTirosina = crisTirosina;
    }

    public boolean getLevadura() {
        return levadura;
    }

    public void setLevadura(boolean levadura) {
        this.levadura = levadura;
    }

    public Boolean getParasitoTrichomona() {
        return parasitoTrichomona;
    }

    public void setParasitoTrichomona(Boolean parasitoTrichomona) {
        this.parasitoTrichomona = parasitoTrichomona;
    }

    public Boolean getParasitoPhitirus() {
        return parasitoPhitirus;
    }

    public void setParasitoPhitirus(Boolean parasitoPhitirus) {
        this.parasitoPhitirus = parasitoPhitirus;
    }

    public Boolean getParasitoHuevo() {
        return parasitoHuevo;
    }

    public void setParasitoHuevo(Boolean parasitoHuevo) {
        this.parasitoHuevo = parasitoHuevo;
    }

    public Boolean getParasitoQuiste() {
        return parasitoQuiste;
    }

    public void setParasitoQuiste(Boolean parasitoQuiste) {
        this.parasitoQuiste = parasitoQuiste;
    }

    public String getFilamentoBacteria() {
        return filamentoBacteria;
    }

    public void setFilamentoBacteria(String filamentoBacteria) {
        this.filamentoBacteria = filamentoBacteria;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sclExamenurianalisisPK != null ? sclExamenurianalisisPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclExamenurianalisis)) {
            return false;
        }
        SclExamenurianalisis other = (SclExamenurianalisis) object;
        if ((this.sclExamenurianalisisPK == null && other.sclExamenurianalisisPK != null) || (this.sclExamenurianalisisPK != null && !this.sclExamenurianalisisPK.equals(other.sclExamenurianalisisPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclExamenurianalisis[ sclExamenurianalisisPK=" + sclExamenurianalisisPK + " ]";
    }
    
}
