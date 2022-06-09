/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swrest.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclPais;
import com.swrest.response.PaisResponse;
/**
 *
 * @author Alexa
 */
@Repository
public interface PaisRepository extends JpaRepository <SclPais, String>
{
	@Query("SELECT p.idPais, p.nomPais, p.idIso2 FROM SclPais p")
	List<PaisResponse> findList();
}
