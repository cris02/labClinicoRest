package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclClasificacionAnexo;

@Repository
public interface ClasificacionAnexoRepository extends JpaRepository <SclClasificacionAnexo, Integer>
{
    
    
}
