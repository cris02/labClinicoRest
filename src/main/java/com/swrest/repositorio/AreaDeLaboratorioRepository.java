package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclAreadelaboratorio;

@Repository
public interface AreaDeLaboratorioRepository extends JpaRepository <SclAreadelaboratorio, Integer>
{
    
    
}
