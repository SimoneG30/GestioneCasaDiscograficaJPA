package it.test.casadiscograficajpa.dao.casadiscografica;

import java.util.List;

import it.test.casadiscograficajpa.dao.IBaseDAO;
import it.test.casadiscograficajpa.model.CasaDiscografica;

public interface CasaDiscograficaDAO extends IBaseDAO<CasaDiscografica>{
	
	public List<CasaDiscografica> findAllByRagioneSociale(String ragioneSocialeInput) throws Exception;
	
	public List<CasaDiscografica> findAllByPartitaIva(String partitaIvaInput) throws Exception;
	
	public CasaDiscografica findByRagioneSocialeEPartitaIva(String ragioneSociale, String partitaIva) throws Exception;
	
	public List<CasaDiscografica> findAllByPartitaIvaIsNull() throws Exception;
}
