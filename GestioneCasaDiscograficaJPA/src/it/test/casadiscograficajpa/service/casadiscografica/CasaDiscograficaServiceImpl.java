package it.test.casadiscograficajpa.service.casadiscografica;

import java.util.List;

import it.test.casadiscograficajpa.dao.casadiscografica.CasaDiscograficaDAO;
import it.test.casadiscograficajpa.model.CasaDiscografica;

public class CasaDiscograficaServiceImpl implements CasaDiscograficaService{

	private CasaDiscograficaDAO casaDiscograficaDao;

	public void setCasaDiscograficaDAO(CasaDiscograficaDAO casaDiscograficaDao) {
		this.casaDiscograficaDao = casaDiscograficaDao;
	}


	@Override
	public List<CasaDiscografica> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CasaDiscografica findById(Long idInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int aggiorna(CasaDiscografica input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int inserisciNuovo(CasaDiscografica input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rimuovi(CasaDiscografica input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CasaDiscografica> findByExample(CasaDiscografica input) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CasaDiscografica> cercaTuttiQuelliConPartitaIva(String partitaIvaInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CasaDiscografica> cercaTuttiQuelliConRagioneSociale(String ragioneSocialeInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CasaDiscografica cercaConRagioneSocialeEPartitaIva(String ragioneSociale, String partitaIva)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CasaDiscografica> cercaTuttiQuelliSenzaPartitaIva() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
