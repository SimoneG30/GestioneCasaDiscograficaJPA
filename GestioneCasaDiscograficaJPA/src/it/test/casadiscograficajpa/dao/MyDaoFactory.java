package it.test.casadiscograficajpa.dao;

import it.test.casadiscograficajpa.dao.autore.AutoreDAO;
import it.test.casadiscograficajpa.dao.autore.AutoreDAOImpl;
import it.test.casadiscograficajpa.dao.casadiscografica.CasaDiscograficaDAO;
import it.test.casadiscograficajpa.dao.casadiscografica.CasaDiscograficaDAOImpl;
import it.test.casadiscograficajpa.dao.cd.CdDAO;
import it.test.casadiscograficajpa.dao.cd.CdDAOImpl;

public class MyDaoFactory {

	private static AutoreDAO autoreDAOInstance = null;
	private static CasaDiscograficaDAO casaDiscograficaDAOInstance = null;
	private static CdDAO cdDAOInstance = null;

	public static AutoreDAO getAutoreDAOInstance() {
		if (autoreDAOInstance == null)
			autoreDAOInstance = new AutoreDAOImpl();
		return autoreDAOInstance;
	}

	public static CasaDiscograficaDAO getCasaDiscograficaDAOInstance(){
		if(casaDiscograficaDAOInstance == null)
			casaDiscograficaDAOInstance= new CasaDiscograficaDAOImpl();
		return casaDiscograficaDAOInstance;
	}
	
	public static CdDAO getCdDAOInstance(){
		if(cdDAOInstance == null)
			cdDAOInstance= new CdDAOImpl();
		return cdDAOInstance;
	}

}
