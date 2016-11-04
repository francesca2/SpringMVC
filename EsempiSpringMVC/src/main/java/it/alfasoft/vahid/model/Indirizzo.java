package it.alfasoft.vahid.model;

public class Indirizzo {
	private String citta;
	private String via;
	
public Indirizzo() {
	
	}
	
	public Indirizzo(String citta, String via) {
		
		this.citta = citta;
		this.via = via;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}
	
	
	

}
