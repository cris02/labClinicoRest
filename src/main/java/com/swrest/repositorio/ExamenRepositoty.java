package com.swrest.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swrest.model.VExamenes;

@Repository
public interface ExamenRepositoty extends JpaRepository<VExamenes, Integer> {
	
	 @Query(value = "SELECT * FROM v_examenes WHERE id_paciente = ?1",  nativeQuery = true)
	 List<VExamenes> getExamenesPac (Integer id);

}
