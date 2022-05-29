package com.swrest.repositorio;

import com.swrest.model.SclRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository <SclRol, Integer>
{
    
    
}
