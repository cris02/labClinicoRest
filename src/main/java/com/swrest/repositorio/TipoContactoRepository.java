package com.swrest.repositorio;

import com.swrest.model.SclTipoContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoContactoRepository extends JpaRepository <SclTipoContacto, Integer>
{
    
    
}
