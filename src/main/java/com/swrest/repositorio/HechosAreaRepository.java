package com.swrest.repositorio;

import com.swrest.model.SclHechosArea;
import com.swrest.model.SclHechosAreaPK;

//import com.swrest.model.SclHechosAreaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HechosAreaRepository extends JpaRepository <SclHechosArea, SclHechosAreaPK>
{
    
    
}
