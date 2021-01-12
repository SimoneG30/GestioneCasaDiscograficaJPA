package it.test.casadiscograficajpa.dao.autore;

import java.util.List;

import it.test.casadiscograficajpa.dao.IBaseDAO;
import it.test.casadiscograficajpa.model.Autore;

public interface AutoreDAO extends IBaseDAO<Autore>{

	public List<Autore> findAllByCognome(String cognomeInput) throws Exception;
	
	public List<Autore> findAllByNomeIniziaCon(String caratteriInizialiInput) throws Exception;
	
	public Autore findByNomeECognome(String nomeInput, String cognomeInput) throws Exception;
	
}
