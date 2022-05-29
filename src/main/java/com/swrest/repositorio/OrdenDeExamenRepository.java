package com.swrest.repositorio;

import com.swrest.model.SclOrdendeexamen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenDeExamenRepository extends JpaRepository <SclOrdendeexamen, Integer>
{
    
    
}
