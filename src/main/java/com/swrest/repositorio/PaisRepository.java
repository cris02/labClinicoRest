/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swrest.repositorio;

import com.swrest.model.SclPais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Alexa
 */
@Repository
public interface PaisRepository extends JpaRepository <SclPais, String>
{

    
}
