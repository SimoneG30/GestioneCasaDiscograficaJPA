package it.test.casadiscograficajpa.dao.casadiscografica;

import java.util.List;

import javax.persistence.EntityManager;

import it.test.casadiscograficajpa.model.CasaDiscografica;

public class CasaDiscograficaDAOImpl implements CasaDiscograficaDAO{

	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<CasaDiscografica> list() throws Exception {
		return entityManager.createQuery("from Abitante", CasaDiscografica.class).getResultList();
	}

	@Override
	public CasaDiscografica get(Long id) throws Exception {
		return entityManager.find(CasaDiscografica.class, id);		
	}

	@Override
	public void update(CasaDiscografica casaDiscograficaInstance) throws Exception {
		if (casaDiscograficaInstance == null) {
		throw new Exception("Problema valore in input");
	}

		casaDiscograficaInstance = entityManager.merge(casaDiscograficaInstance);
}

	@Override
	public void insert(CasaDiscografica casaDiscograficaInstance) throws Exception {
		if (casaDiscograficaInstance == null) {
			throw new Exception("Problema valore in input");
		}

		entityManager.persist(casaDiscograficaInstance);
	}

	@Override
	public void delete(CasaDiscografica casaDiscograficaInstance) throws Exception {
		if (casaDiscograficaInstance == null) {
			throw new Exception("Problema valore in input");
		}

		entityManager.remove(entityManager.merge(casaDiscograficaInstance));
	}

	@Override
	public List<CasaDiscografica> findAllByRagioneSociale(String ragioneSocialeInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CasaDiscografica> findAllByPartitaIva(String partitaIvaInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CasaDiscografica findByRagioneSocialeEPartitaIva(String ragioneSociale, String partitaIva) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CasaDiscografica> findAllByPartitaIvaIsNull() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}
