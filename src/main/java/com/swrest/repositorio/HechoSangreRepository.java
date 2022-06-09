package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclHechoSangre;
import com.swrest.model.SclHechoSangrePK;

@Repository
public interface HechoSangreRepository extends JpaRepository<SclHechoSangre, SclHechoSangrePK> {

}
