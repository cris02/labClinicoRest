/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swrest.controlador;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.swrest.servicio.paisserv;
import com.swrest.servicio.tipodocumentoserv;
import com.swrest.servicio.usuarioserv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexa
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rpt")
public class rptcontrolador 
{
    @Autowired
    private usuarioserv usuarioservicio;
    private tipodocumentoserv tipodocumentoservicio;
    private paisserv paisservicio;

    
    @GetMapping
    public ResponseEntity<String> listar(@RequestParam("id") String id) // , @RequestParam(name="filter", required = false ) String filter
    { 
        String l_JsonString;
        Gson l_gson;
        
        l_gson = new GsonBuilder().serializeNulls().create();

        switch (id.toLowerCase())
        {
            case "usuario" :
                l_JsonString = l_gson.toJson(usuarioservicio.listar().toArray());
            break; // break es opcional
            
            case "tipodocumento" :
                l_JsonString = l_gson.toJson(tipodocumentoservicio.listar().toArray());
            break; // break es opcional
            
            case "pais" :
                l_JsonString = l_gson.toJson(paisservicio.listar().toArray());
            break; // break es opcional
            
            default : 
                l_JsonString = "NO Se reconoce la peticion";
        }
        
        return new ResponseEntity<>(l_JsonString, HttpStatus.OK);
    }
    
    
}


