package it.test.casadiscograficajpa.service.cd;

import java.util.List;

import it.test.casadiscograficajpa.dao.cd.CdDAO;
import it.test.casadiscograficajpa.model.Cd;

public class CdServiceImpl implements CdService{

	private CdDAO cdDao;

	public void setCdDAO(CdDAO cdDao) {
		this.cdDao = cdDao;
	}

	@Override
	public List<Cd> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cd findById(Long idInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int aggiorna(Cd input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int inserisciNuovo(Cd input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rimuovi(Cd input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Cd> findByExample(Cd input) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cd> cercaTuttiQuelliConTitolo(String titoloInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cd> cercaPerTitoloCheIniziaCon(String caratteriInizialiInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cd cercaPerTitoloEGenere(String titoloInput, String genereInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cd> cercaTuttiQuelliSenzaGenere() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
