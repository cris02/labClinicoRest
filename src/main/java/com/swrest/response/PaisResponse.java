package com.swrest.response;


public class PaisResponse {
	
	private String idPais;
    private String nomPais;
    private String idIso2;
    
    public PaisResponse() { }
    
	public PaisResponse(String idPais, String nomPais, String idIso2) {
		this.idPais = idPais;
		this.nomPais = nomPais;
		this.idIso2 = idIso2;
	}
	public String getIdPais() {
		return idPais;
	}
	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}
	public String getNomPais() {
		return nomPais;
	}
	public void setNomPais(String nomPais) {
		this.nomPais = nomPais;
	}
	public String getIdIso2() {
		return idIso2;
	}
	public void setIdIso2(String idIso2) {
		this.idIso2 = idIso2;
	}
    
}
