package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclValreferencia;

@Repository
public interface ValreferenciaRepository extends JpaRepository<SclValreferencia, Integer> {

}
