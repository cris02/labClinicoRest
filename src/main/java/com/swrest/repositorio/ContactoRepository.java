package com.swrest.repositorio;

import com.swrest.model.SclContacto;
import com.swrest.model.SclContactoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository <SclContacto, SclContactoPK>
{
    
    
}
