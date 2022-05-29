package com.swrest.repositorio;

import com.swrest.model.SclAreadelaboratorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaDeLaboratorioRepository extends JpaRepository <SclAreadelaboratorio, Integer>
{
    
    
}
