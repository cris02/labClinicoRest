package com.swrest.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclOrdendeexamen;
import com.swrest.model.SclPaciente;
import com.swrest.request.ExamenResponse;

@Repository
public interface OrdenDeExamenRepository extends JpaRepository <SclOrdendeexamen, Integer>
{
    List<SclOrdendeexamen> findByIdPaciente(SclPaciente idPaciente);
    
}
