/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swrest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "scl_ordendeexamen", catalog = "labclinicodb", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_ordenexamen"})})
@NamedQueries({
    @NamedQuery(name = "SclOrdendeexamen.findAll", query = "SELECT s FROM SclOrdendeexamen s")})
public class SclOrdendeexamen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ordenexamen", nullable = false)
    private Integer idOrdenexamen;
    @Basic(optional = false)
    @Column(name = "fecha_muestra", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaMuestra;
    @Basic(optional = false)
    @Column(name = "hora_muestra", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horaMuestra;
    @Column(name = "cant_sangre")
    private Integer cantSangre;
    @Column(name = "cant_heces")
    private Integer cantHeces;
    @Column(name = "cant_orina")
    private Integer cantOrina;
    @Column(name = "uni_sangre", length = 10)
    private String uniSangre;
    @Column(name = "uni_heces", length = 10)
    private String uniHeces;
    @Column(name = "uni_orina", length = 10)
    private String uniOrina;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclOrdendeexamen", fetch = FetchType.LAZY)
    private List<SclExamenquimicaclinica> sclExamenquimicaclinicaList;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SclPaciente idPaciente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclOrdendeexamen", fetch = FetchType.LAZY)
    private List<SclExamenhematologia> sclExamenhematologiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclOrdendeexamen", fetch = FetchType.LAZY)
    private List<SclExamencoprologia> sclExamencoprologiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sclOrdendeexamen", fetch = FetchType.LAZY)
    private List<SclExamenurianalisis> sclExamenurianalisisList;

    public SclOrdendeexamen() {
    }

    public SclOrdendeexamen(Integer idOrdenexamen) {
        this.idOrdenexamen = idOrdenexamen;
    }

    public SclOrdendeexamen(Integer idOrdenexamen, Date fechaMuestra, Date horaMuestra) {
        this.idOrdenexamen = idOrdenexamen;
        this.fechaMuestra = fechaMuestra;
        this.horaMuestra = horaMuestra;
    }

    public Integer getIdOrdenexamen() {
        return idOrdenexamen;
    }

    public void setIdOrdenexamen(Integer idOrdenexamen) {
        this.idOrdenexamen = idOrdenexamen;
    }

    public Date getFechaMuestra() {
        return fechaMuestra;
    }

    public void setFechaMuestra(Date fechaMuestra) {
        this.fechaMuestra = fechaMuestra;
    }

    public Date getHoraMuestra() {
        return horaMuestra;
    }

    public void setHoraMuestra(Date horaMuestra) {
        this.horaMuestra = horaMuestra;
    }

    public Integer getCantSangre() {
        return cantSangre;
    }

    public void setCantSangre(Integer cantSangre) {
        this.cantSangre = cantSangre;
    }

    public Integer getCantHeces() {
        return cantHeces;
    }

    public void setCantHeces(Integer cantHeces) {
        this.cantHeces = cantHeces;
    }

    public Integer getCantOrina() {
        return cantOrina;
    }

    public void setCantOrina(Integer cantOrina) {
        this.cantOrina = cantOrina;
    }

    public String getUniSangre() {
        return uniSangre;
    }

    public void setUniSangre(String uniSangre) {
        this.uniSangre = uniSangre;
    }

    public String getUniHeces() {
        return uniHeces;
    }

    public void setUniHeces(String uniHeces) {
        this.uniHeces = uniHeces;
    }

    public String getUniOrina() {
        return uniOrina;
    }

    public void setUniOrina(String uniOrina) {
        this.uniOrina = uniOrina;
    }

    public List<SclExamenquimicaclinica> getSclExamenquimicaclinicaList() {
        return sclExamenquimicaclinicaList;
    }

    public void setSclExamenquimicaclinicaList(List<SclExamenquimicaclinica> sclExamenquimicaclinicaList) {
        this.sclExamenquimicaclinicaList = sclExamenquimicaclinicaList;
    }

    public SclPaciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(SclPaciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public List<SclExamenhematologia> getSclExamenhematologiaList() {
        return sclExamenhematologiaList;
    }

    public void setSclExamenhematologiaList(List<SclExamenhematologia> sclExamenhematologiaList) {
        this.sclExamenhematologiaList = sclExamenhematologiaList;
    }

    public List<SclExamencoprologia> getSclExamencoprologiaList() {
        return sclExamencoprologiaList;
    }

    public void setSclExamencoprologiaList(List<SclExamencoprologia> sclExamencoprologiaList) {
        this.sclExamencoprologiaList = sclExamencoprologiaList;
    }

    public List<SclExamenurianalisis> getSclExamenurianalisisList() {
        return sclExamenurianalisisList;
    }

    public void setSclExamenurianalisisList(List<SclExamenurianalisis> sclExamenurianalisisList) {
        this.sclExamenurianalisisList = sclExamenurianalisisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdenexamen != null ? idOrdenexamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SclOrdendeexamen)) {
            return false;
        }
        SclOrdendeexamen other = (SclOrdendeexamen) object;
        if ((this.idOrdenexamen == null && other.idOrdenexamen != null) || (this.idOrdenexamen != null && !this.idOrdenexamen.equals(other.idOrdenexamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencialabv1.models.SclOrdendeexamen[ idOrdenexamen=" + idOrdenexamen + " ]";
    }
    
}
