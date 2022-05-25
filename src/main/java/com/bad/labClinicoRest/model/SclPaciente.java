/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package persistencialab.entities;
package com.bad.labClinicoRest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "scl_paciente", catalog = "labclinicodb", schema = "UESBAD", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_paciente"})})
@NamedQueries({
    @NamedQuery(name = "SclPaciente.findAll", query = "SELECT s FROM SclPaciente s")})
public class SclPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_paciente", nullable = false)
    private Integer idPaciente;
    @Basic(optional = false)
    @Column(name = "num_documento", nullable = false, length = 20)
    private String numDocumento;
    @Basic(optional = false)
    @Column(name = "nom_paciente", nullable = false, length = 50)
    private String nomPaciente;
    @Basic(optional = false)
    @Column(name = "ape_paciente", nullable = false, length = 50)
    private String apePaciente;
    @Column(name = "ape_casada", length = 50)
    private String apeCasada;
    @Basic(optional = false)
    @Column(name = "genero", nullable = false)
    private boolean genero;
    @Basic(optional = false)
    @Column(name = "fechanacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Basic(optional = false)
    @Column(name = "tel_paciente", nullable = false, length = 8)
    private String telPaciente;
    @Basic(optional = false)
    @Column(name = "estado_civil", nullable = false, length = 25)
    private String estadoCivil;
    @Basic(optional = false)
    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;
    @Basic(optional = false)
    @Column(name = "nom_respondable", nullable = false, length = 50)
    private String nomRespondable;
    @Basic(optional = false)
    @Column(name = "tel_responsable", nullable = false, length = 8)
    private String telResponsable;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclPaciente", fetch = FetchType.LAZY)
    private List<SclHechoSangre> sclHechoSangreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente", fetch = FetchType.LAZY)
    private List<SclCita> sclCitaList;
    @JoinColumns({
        @JoinColumn(name = "id_pais", referencedColumnName = "id_pais"),
        @JoinColumn(name = "id_depto", referencedColumnName = "id_depto"),
        @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio")})
    @ManyToOne(fetch = FetchType.LAZY)
    private SclMunicipio sclMunicipio;
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclTipoDocumento idTipoDocumento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclPaciente", fetch = FetchType.LAZY)
    private List<SclHechosArea> sclHechosAreaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclPaciente", fetch = FetchType.LAZY)
    private List<SclHechoEpidemiologia> sclHechoEpidemiologiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclPaciente", fetch = FetchType.LAZY)
    private List<SclContacto> sclContactoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclPaciente", fetch = FetchType.LAZY)
    private List<SclDocumentoAnexo> sclDocumentoAnexoList;

    public SclPaciente() {
    }

    public SclPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public SclPaciente(Integer idPaciente, String numDocumento, String nomPaciente, String apePaciente, boolean genero, Date fechanacimiento, String telPaciente, String estadoCivil, String direccion, String nomRespondable, String telResponsable) {
        this.idPaciente = idPaciente;
        this.numDocumento = numDocumento;
        this.nomPaciente = nomPaciente;
        this.apePaciente = apePaciente;
        this.genero = genero;
        this.fechanacimiento = fechanacimiento;
        this.telPaciente = telPaciente;
        this.estadoCivil = estadoCivil;
        this.direccion = direccion;
        this.nomRespondable = nomRespondable;
        this.telResponsable = telResponsable;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNomPaciente() {
        return nomPaciente;
    }

    public void setNomPaciente(String nomPaciente) {
        this.nomPaciente = nomPaciente;
    }

    public String getApePaciente() {
        return apePaciente;
    }

    public void setApePaciente(String apePaciente) {
        this.apePaciente = apePaciente;
    }

    public String getApeCasada() {
        return apeCasada;
    }

    public void setApeCasada(String apeCasada) {
        this.apeCasada = apeCasada;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getTelPaciente() {
        return telPaciente;
    }

    public void setTelPaciente(String telPaciente) {
        this.telPaciente = telPaciente;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNomRespondable() {
        return nomRespondable;
    }

    public void setNomRespondable(String nomRespondable) {
        this.nomRespondable = nomRespondable;
    }

    public String getTelResponsable() {
        return telResponsable;
    }

    public void setTelResponsable(String telResponsable) {
        this.telResponsable = telResponsable;
    }

    public List<SclHechoSangre> getSclHechoSangreList() {
        return sclHechoSangreList;
    }

    public void setSclHechoSangreList(List<SclHechoSangre> sclHechoSangreList) {
        this.sclHechoSangreList = sclHechoSangreList;
    }

    public List<SclCita> getSclCitaList() {
        return sclCitaList;
    }

    public void setSclCitaList(List<SclCita> sclCitaList) {
        this.sclCitaList = sclCitaList;
    }

    public SclMunicipio getSclMunicipio() {
        return sclMunicipio;
    }

    public void setSclMunicipio(SclMunicipio sclMunicipio) {
        this.sclMunicipio = sclMunicipio;
    }

    public SclTipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(SclTipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public List<SclHechosArea> getSclHechosAreaList() {
        return sclHechosAreaList;
    }

    public void setSclHechosAreaList(List<SclHechosArea> sclHechosAreaList) {
        this.sclHechosAreaList = sclHechosAreaList;
    }

    public List<SclHechoEpidemiologia> getSclHechoEpidemiologiaList() {
        return sclHechoEpidemiologiaList;
    }

    public void setSclHechoEpidemiologiaList(List<SclHechoEpidemiologia> sclHechoEpidemiologiaList) {
        this.sclHechoEpidemiologiaList = sclHechoEpidemiologiaList;
    }

    public List<SclContacto> getSclContactoList() {
        return sclContactoList;
    }

    public void setSclContactoList(List<SclContacto> sclContactoList) {
        this.sclContactoList = sclContactoList;
    }

    public List<SclDocumentoAnexo> getSclDocumentoAnexoList() {
        return sclDocumentoAnexoList;
    }

    public void setSclDocumentoAnexoList(List<SclDocumentoAnexo> sclDocumentoAnexoList) {
        this.sclDocumentoAnexoList = sclDocumentoAnexoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaciente != null ? idPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclPaciente)) {
            return false;
        }
        SclPaciente other = (SclPaciente) object;
        if ((this.idPaciente == null && other.idPaciente != null) || (this.idPaciente != null && !this.idPaciente.equals(other.idPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialab.entities.SclPaciente[ idPaciente=" + idPaciente + " ]";
    }
    
}