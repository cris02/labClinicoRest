package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclExamenhematologia;
import com.swrest.model.SclExamenhematologiaPK;

@Repository
public interface ExamenHemaRepository extends JpaRepository<SclExamenhematologia, SclExamenhematologiaPK> {

}
