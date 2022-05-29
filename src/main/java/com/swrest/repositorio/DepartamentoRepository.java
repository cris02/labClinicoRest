package com.swrest.repositorio;

import com.swrest.model.SclDepartamento;
import com.swrest.model.SclDepartamentoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository <SclDepartamento, Integer>
{
    
    
}
