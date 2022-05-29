package com.swrest.repositorio;

import com.swrest.model.SclClasificacionAnexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionAnexoRepository extends JpaRepository <SclClasificacionAnexo, Integer>
{
    
    
}
