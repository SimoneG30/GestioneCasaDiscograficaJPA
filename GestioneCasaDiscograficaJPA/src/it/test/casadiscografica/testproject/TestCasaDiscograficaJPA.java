package it.test.casadiscografica.testproject;

import it.test.casadiscograficajpa.dao.EntityManagerUtil;
import it.test.casadiscograficajpa.model.Autore;
import it.test.casadiscograficajpa.model.CasaDiscografica;
import it.test.casadiscograficajpa.model.Cd;
import it.test.casadiscograficajpa.service.MyServiceFactory;
import it.test.casadiscograficajpa.service.autore.AutoreService;
import it.test.casadiscograficajpa.service.casadiscografica.CasaDiscograficaService;
import it.test.casadiscograficajpa.service.cd.CdService;

public class TestCasaDiscograficaJPA {
	
	public static void main(String[] args) {
		
		AutoreService autoreService = MyServiceFactory.getAutoreServiceInstance();
		CasaDiscograficaService casaDiscograficaService = MyServiceFactory.getCasaDiscograficaServiceInstance();
		CdService cdService = MyServiceFactory.getCdServiceInstance();
		try {
			
			CasaDiscografica nuovaCasaDiscografica = new CasaDiscografica("New Records", "A000000");
			casaDiscograficaService.inserisciNuovo(nuovaCasaDiscografica);
			System.out.println("Casa Discografica appena inserita: " + nuovaCasaDiscografica);
			
			Autore nuovoAutore = new Autore("Mario", "Rossi");
			nuovoAutore.setCasaDiscografica(nuovaCasaDiscografica);
			autoreService.inserisciNuovo(nuovoAutore);
			System.out.println("Autore appena inserito: " + nuovoAutore);

			Cd nuovoCd = new Cd("New Title", "Rock", 25);
			nuovoCd.setAutore(nuovoAutore);
			cdService.inserisciNuovo(nuovoCd);
			System.out.println("Cd appena inserito: " + nuovoCd);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			EntityManagerUtil.shutdown();
		}
	}
}
