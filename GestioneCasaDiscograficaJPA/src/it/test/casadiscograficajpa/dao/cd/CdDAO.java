package it.test.casadiscograficajpa.dao.cd;

import java.util.List;

import it.test.casadiscograficajpa.dao.IBaseDAO;
import it.test.casadiscograficajpa.model.Cd;

public interface CdDAO extends IBaseDAO<Cd> {

	public List<Cd> findAllByTitolo(String titoloInput) throws Exception;
	
	public List<Cd> findAllByTitoloIniziaCon(String caratteriInizialiInput) throws Exception;
	
	public Cd findByTitoloAndGenere(String titoloInput, String genereInput) throws Exception;
	
	public List<Cd> findAllByGenereIsNull() throws Exception;
}
