package com.swrest.repositorio;

import com.swrest.model.SclMunicipio;
//import com.swrest.model.SclMunicipioPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends JpaRepository <SclMunicipio, Integer>
{
    
    
}
