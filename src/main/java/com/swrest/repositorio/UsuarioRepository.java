package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclUsuario;

@Repository
public interface UsuarioRepository extends JpaRepository <SclUsuario, Integer>
{
    
}
