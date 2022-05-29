package com.swrest.repositorio;

import com.swrest.model.SclCita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository <SclCita, Integer>
{
    
    
}
