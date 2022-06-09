package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclHechosArea;
import com.swrest.model.SclHechosAreaPK;

@Repository
public interface HechosAreaRepository extends JpaRepository<SclHechosArea, SclHechosAreaPK> {

}
