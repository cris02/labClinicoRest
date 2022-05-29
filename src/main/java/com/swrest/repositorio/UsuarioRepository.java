package com.swrest.repositorio;

import com.swrest.model.SclUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <SclUsuario, Integer>
{
    
    
}
