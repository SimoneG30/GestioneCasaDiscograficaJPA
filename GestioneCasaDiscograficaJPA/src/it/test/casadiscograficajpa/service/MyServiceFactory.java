package it.test.casadiscograficajpa.service;

import it.test.casadiscograficajpa.dao.MyDaoFactory;
import it.test.casadiscograficajpa.service.autore.AutoreService;
import it.test.casadiscograficajpa.service.autore.AutoreServiceImpl;
import it.test.casadiscograficajpa.service.casadiscografica.CasaDiscograficaService;
import it.test.casadiscograficajpa.service.casadiscografica.CasaDiscograficaServiceImpl;
import it.test.casadiscograficajpa.service.cd.CdService;
import it.test.casadiscograficajpa.service.cd.CdServiceImpl;

public class MyServiceFactory {

	private static AutoreService autoreServiceInstance = null;
	private static CasaDiscograficaService casaDiscograficaServiceInstance = null;
	private static CdService cdServiceInstance = null;


	public static AutoreService getAutoreServiceInstance() {
		if (autoreServiceInstance == null) {
			autoreServiceInstance = new AutoreServiceImpl();
			autoreServiceInstance.setAutoreDAO(MyDaoFactory.getAutoreDAOInstance());
		}
		return autoreServiceInstance;
	}

	public static CasaDiscograficaService getCasaDiscograficaServiceInstance() {
		if (casaDiscograficaServiceInstance == null) {
			casaDiscograficaServiceInstance = new CasaDiscograficaServiceImpl();
			casaDiscograficaServiceInstance.setCasaDiscograficaDAO(MyDaoFactory.getCasaDiscograficaDAOInstance());
		}
		return casaDiscograficaServiceInstance;
	}
	
	public static CdService getCdServiceInstance() {
		if (cdServiceInstance == null) {
			cdServiceInstance = new CdServiceImpl();
			cdServiceInstance.setCdDAO(MyDaoFactory.getCdDAOInstance());
		}
		return cdServiceInstance;
	}
}
