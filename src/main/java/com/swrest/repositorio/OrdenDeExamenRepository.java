package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclOrdendeexamen;

@Repository
public interface OrdenDeExamenRepository extends JpaRepository <SclOrdendeexamen, Integer>
{
    
    
}
