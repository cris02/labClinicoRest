package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclTipoContacto;

@Repository
public interface TipoContactoRepository extends JpaRepository <SclTipoContacto, Integer>
{
    
    
}
