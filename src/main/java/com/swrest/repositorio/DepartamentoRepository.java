package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclDepartamento;
import com.swrest.model.SclDepartamentoPK;

@Repository
public interface DepartamentoRepository extends JpaRepository <SclDepartamento, SclDepartamentoPK>
{
    
    
}
