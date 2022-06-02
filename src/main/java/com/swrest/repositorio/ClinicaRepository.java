package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclClinica;

@Repository
public interface ClinicaRepository extends JpaRepository<SclClinica, Integer> {
	
}
