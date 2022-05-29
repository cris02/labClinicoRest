package com.swrest.repositorio;

import com.swrest.model.SclPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository <SclPaciente, Integer>
{
    
    
}
