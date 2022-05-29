package com.swrest.repositorio;

import com.swrest.model.SclOpcionMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpcionMenuRepository extends JpaRepository <SclOpcionMenu, Integer>
{
    
    
}
