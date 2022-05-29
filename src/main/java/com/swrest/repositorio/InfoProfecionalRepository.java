package com.swrest.repositorio;

import com.swrest.model.SclInfoprofecional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoProfecionalRepository extends JpaRepository <SclInfoprofecional, Integer>
{
    
    
}
