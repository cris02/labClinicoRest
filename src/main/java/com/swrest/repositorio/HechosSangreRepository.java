package com.swrest.repositorio;

import com.swrest.model.SclHechoSangre;
import com.swrest.model.SclHechoSangrePK;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HechosSangreRepository extends JpaRepository <SclHechoSangre, SclHechoSangrePK>
{
    
    
}
