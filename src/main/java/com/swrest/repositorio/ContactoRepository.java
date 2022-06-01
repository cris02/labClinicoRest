package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclContacto;
import com.swrest.model.SclContactoPK;

@Repository
public interface ContactoRepository extends JpaRepository <SclContacto, SclContactoPK>
{
    
    
}
