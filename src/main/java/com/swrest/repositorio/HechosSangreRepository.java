package com.swrest.repositorio;

import com.swrest.model.SclHechoSangre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HechosSangreRepository extends JpaRepository <SclHechoSangre, Integer>
{
    
    
}
