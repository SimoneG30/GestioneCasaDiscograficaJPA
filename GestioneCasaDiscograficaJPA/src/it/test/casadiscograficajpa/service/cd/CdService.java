package it.test.casadiscograficajpa.service.cd;

import java.util.List;

import it.test.casadiscograficajpa.dao.cd.CdDAO;
import it.test.casadiscograficajpa.model.Cd;

public interface CdService {

	public void setCdDAO(CdDAO casaDiscograficaDao);

	public List<Cd> listAll() throws Exception;

	public Cd findById(Long idInput) throws Exception;

	public int aggiorna(Cd input) throws Exception;

	public int inserisciNuovo(Cd input) throws Exception;

	public int rimuovi(Cd input) throws Exception;

	public List<Cd> findByExample(Cd input) throws Exception;
	
	public List<Cd> cercaTuttiQuelliConTitolo(String titoloInput) throws Exception;
	
	public List<Cd> cercaPerTitoloCheIniziaCon(String caratteriInizialiInput) throws Exception;
	
	public Cd cercaPerTitoloEGenere(String titoloInput, String genereInput) throws Exception;

	public List<Cd> cercaTuttiQuelliSenzaGenere() throws Exception;
}
