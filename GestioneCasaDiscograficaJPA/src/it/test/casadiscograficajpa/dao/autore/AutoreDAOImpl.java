package it.test.casadiscograficajpa.dao.autore;

import java.util.List;

import javax.persistence.EntityManager;

import it.test.casadiscograficajpa.model.Autore;

public class AutoreDAOImpl implements AutoreDAO{

	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Autore> list() throws Exception {
		return entityManager.createQuery("from Autore", Autore.class).getResultList();

	}

	@Override
	public Autore get(Long id) throws Exception {
		return entityManager.find(Autore.class, id);
	}

	@Override
	public void update(Autore autoreInstance) throws Exception {
		if (autoreInstance == null) {
			throw new Exception("Problema valore in input");
		}
		autoreInstance = entityManager.merge(autoreInstance);
	}
	
	@Override
	public void insert(Autore autoreInstance) throws Exception {
		if (autoreInstance == null) {
			throw new Exception("Problema valore in input");
		}

		entityManager.persist(autoreInstance);
	}

	@Override
	public void delete(Autore autoreInstance) throws Exception {
		if (autoreInstance == null) {
			throw new Exception("Problema valore in input");
		}

		entityManager.remove(entityManager.merge(autoreInstance));
	}

	@Override
	public List<Autore> findAllByCognome(String cognomeInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Autore> findAllByNomeIniziaCon(String caratteriInizialiInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autore findByNomeECognome(String nomeInput, String cognomeInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
