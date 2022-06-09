package com.swrest.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "v_examenes", catalog = "labclinicodb", schema = "UESBAD")
@NamedQueries({
    @NamedQuery(name = "VExamenes.findAll", query = "SELECT v FROM VExamenes v")})
public class VExamenes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_ordenexamen")
    private Integer idOrdenexamen;
    @Column(name = "id_exam")
    private Integer idExam;
    @Column(name = "tipo")
    private Integer tipo;
    @Id
    @Column(name = "id_paciente")
    private Integer idPaciente;

    public VExamenes() {
    }

    public Integer getIdOrdenexamen() {
        return idOrdenexamen;
    }

    public void setIdOrdenexamen(Integer idOrdenexamen) {
        this.idOrdenexamen = idOrdenexamen;
    }

    public Integer getIdExam() {
        return idExam;
    }

    public void setIdExam(Integer idExam) {
        this.idExam = idExam;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
    
}