package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclExamenurianalisis;
import com.swrest.model.SclExamenurianalisisPK;

@Repository
public interface ExamenUrianalisisRepository extends JpaRepository <SclExamenurianalisis, SclExamenurianalisisPK>
{
    
    
}
