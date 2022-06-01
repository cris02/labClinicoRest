package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclOpcionmenu;

@Repository
public interface OpcionMenuRepository extends JpaRepository <SclOpcionmenu, Integer>
{
    
    
}
