package com.swrest.repositorio;

//import com.swrest.model.SclDocumentoAnexoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swrest.model.SclDocumentoAnexo;
import com.swrest.model.SclDocumentoAnexoPK;

@Repository
public interface DocumentoAnexoRepository extends JpaRepository <SclDocumentoAnexo, SclDocumentoAnexoPK>
{
    
    
}
