package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclPaciente;

@Repository
public interface PacienteRepository extends JpaRepository <SclPaciente, Integer>
{
    
    
}
