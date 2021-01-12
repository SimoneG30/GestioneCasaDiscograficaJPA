package it.test.casadiscograficajpa.service.autore;

import java.util.List;

import it.test.casadiscograficajpa.dao.autore.AutoreDAO;
import it.test.casadiscograficajpa.model.Autore;

public class AutoreServiceImpl implements AutoreService{

	private AutoreDAO autoreDao;

	public void setAutoreDAO(AutoreDAO autoreDao) {
		this.autoreDao = autoreDao;
	}

	@Override
	public List<Autore> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autore findById(Long idInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int aggiorna(Autore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int inserisciNuovo(Autore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rimuovi(Autore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Autore> findByExample(Autore input) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Autore> cercaTuttiQuelliConCognome(String cognomeInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Autore> cercaPerNomeCheIniziaCon(String caratteriInizialiInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autore cercaPerNomeECognome(String nomeInput, String cognomeInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
