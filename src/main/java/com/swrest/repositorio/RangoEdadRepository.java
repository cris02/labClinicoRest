package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclRangoEdad;

@Repository
public interface RangoEdadRepository extends JpaRepository<SclRangoEdad, Integer> {

}
