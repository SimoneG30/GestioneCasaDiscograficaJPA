package it.test.casadiscograficajpa.service.casadiscografica;

import java.util.List;

import it.test.casadiscograficajpa.dao.casadiscografica.CasaDiscograficaDAO;
import it.test.casadiscograficajpa.model.CasaDiscografica;

public interface CasaDiscograficaService {

	public void setCasaDiscograficaDAO(CasaDiscograficaDAO casaDiscograficaDao);

	public List<CasaDiscografica> listAll() throws Exception;

	public CasaDiscografica findById(Long idInput) throws Exception;

	public int aggiorna(CasaDiscografica input) throws Exception;

	public int inserisciNuovo(CasaDiscografica input) throws Exception;

	public int rimuovi(CasaDiscografica input) throws Exception;

	public List<CasaDiscografica> findByExample(CasaDiscografica input) throws Exception;
	
	public List<CasaDiscografica> cercaTuttiQuelliConPartitaIva(String partitaIvaInput) throws Exception;
	
	public List<CasaDiscografica> cercaTuttiQuelliConRagioneSociale(String ragioneSocialeInput) throws Exception;
	
	public CasaDiscografica cercaConRagioneSocialeEPartitaIva(String ragioneSociale, String partitaIva) throws Exception;
	
	public List<CasaDiscografica> cercaTuttiQuelliSenzaPartitaIva() throws Exception;
}
