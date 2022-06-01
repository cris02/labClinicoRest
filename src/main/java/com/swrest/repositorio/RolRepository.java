package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclRol;

@Repository
public interface RolRepository extends JpaRepository <SclRol, Integer>
{
    
    
}
