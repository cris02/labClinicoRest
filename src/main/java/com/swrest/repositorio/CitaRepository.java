package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclCita;

@Repository
public interface CitaRepository extends JpaRepository <SclCita, Integer>
{
    
    
}
