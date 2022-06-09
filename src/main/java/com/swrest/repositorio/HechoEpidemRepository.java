package com.swrest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclHechoEpidemiologia;
import com.swrest.model.SclHechoEpidemiologiaPK;

@Repository
public interface HechoEpidemRepository extends JpaRepository<SclHechoEpidemiologia, SclHechoEpidemiologiaPK> {

}
