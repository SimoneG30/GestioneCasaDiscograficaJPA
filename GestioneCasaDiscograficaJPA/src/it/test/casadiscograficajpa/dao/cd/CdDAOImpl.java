package it.test.casadiscograficajpa.dao.cd;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import it.test.casadiscograficajpa.model.Cd;

public class CdDAOImpl implements CdDAO{

	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Cd> list() throws Exception {
		return entityManager.createQuery("from Abitante", Cd.class).getResultList();
	}

	@Override
	public Cd get(Long id) throws Exception {
		return entityManager.find(Cd.class, id);
	}

	@Override
	public void update(Cd cdInstance) throws Exception {
		if (cdInstance == null) {
			throw new Exception("Problema valore in input");
		}

		cdInstance = entityManager.merge(cdInstance);
	}

	@Override
	public void insert(Cd cdInstance) throws Exception {
		if (cdInstance == null) {
			throw new Exception("Problema valore in input");
		}

		entityManager.persist(cdInstance);
	}

	@Override
	public void delete(Cd cdInstance) throws Exception {
		if (cdInstance == null) {
			throw new Exception("Problema valore in input");
		}

		entityManager.remove(entityManager.merge(cdInstance));
	}

	@Override
	public List<Cd> findAllByTitolo(String titoloInput) throws Exception {
		TypedQuery<Cd> query = entityManager.createQuery("from Abitante a where a.nome like ?1", Cd.class);
		return query.setParameter(1, titoloInput).getResultList();
	}

	@Override
	public List<Cd> findAllByTitoloIniziaCon(String caratteriInizialiInput) throws Exception {
		TypedQuery<Cd> query = entityManager.createQuery("from Cd left join fetch cd.autore where titolo like ?1", Cd.class);
		return query.setParameter(1, caratteriInizialiInput + '%').getResultList();
	}

	@Override
	public Cd findByTitoloAndGenere(String titoloInput, String genereInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cd> findAllByGenereIsNull() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
