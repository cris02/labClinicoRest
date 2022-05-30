package com.swrest.repositorio;

import com.swrest.model.SclExamenurianalisis;
import com.swrest.model.SclExamenurianalisisPK;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenUrianalisisRepository extends JpaRepository <SclExamenurianalisis, SclExamenurianalisisPK>
{
    
    
}
