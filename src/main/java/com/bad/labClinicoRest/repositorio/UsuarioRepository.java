package com.bad.labClinicoRest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bad.labClinicoRest.model.SclUsuario;

@Repository
public interface UsuarioRepository extends JpaRepository <SclUsuario, Integer>
{
    
    
}
