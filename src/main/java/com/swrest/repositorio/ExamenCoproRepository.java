package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclExamencoprologia;
import com.swrest.model.SclExamencoprologiaPK;

@Repository
public interface ExamenCoproRepository extends JpaRepository<SclExamencoprologia, SclExamencoprologiaPK>{

}
