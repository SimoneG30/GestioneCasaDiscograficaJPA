package it.test.casadiscograficajpa.service.autore;

import java.util.List;

import it.test.casadiscograficajpa.dao.autore.AutoreDAO;
import it.test.casadiscograficajpa.model.Autore;

public interface AutoreService {

	public void setAutoreDAO(AutoreDAO autoreDao);

	public List<Autore> listAll() throws Exception;

	public Autore findById(Long idInput) throws Exception;

	public int aggiorna(Autore input) throws Exception;

	public int inserisciNuovo(Autore input) throws Exception;

	public int rimuovi(Autore input) throws Exception;

	public List<Autore> findByExample(Autore input) throws Exception;
	
	public List<Autore> cercaTuttiQuelliConCognome(String cognomeInput) throws Exception;
	
	public List<Autore> cercaPerNomeCheIniziaCon(String caratteriInizialiInput) throws Exception;
	
	public Autore cercaPerNomeECognome(String nomeInput, String cognomeInput) throws Exception;

}
