package com.bad.labClinicoRest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bad.labClinicoRest.model.SclPaciente;

@Repository
public interface PacienteRepository extends JpaRepository<SclPaciente, Integer> {

}
