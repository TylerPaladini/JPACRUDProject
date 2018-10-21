package com.skilldistillery.megafauna.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.skilldistillery.megafauna.entities.Megafauna;


@Transactional
@Repository
public class MegafaunaDOAImpl implements MegafaunaDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Megafauna findById(int id) {
		Megafauna megafauna = em.find(Megafauna.class, id);
		
	
		return megafauna;
		
	}
	@Override
	public List<Megafauna> showAll(Megafauna megafauna) {
		
		
		
		return null;
	
		
		
	}
	
	
	@Override
	public Megafauna create(Megafauna megafauna) {
		em.persist(megafauna);
		em.flush();
		em.close();
		
		return null;
	}

	@Override
	public Boolean update(int id, Megafauna megafauna) {
		Megafauna updateMega = em.find(Megafauna.class, id);
		
		
			megafauna.setName(updateMega.getName());
			megafauna.setLatinScientific(updateMega.getLatinScientific());
			megafauna.setDescription(updateMega.getDescription());
			megafauna.setWeight(updateMega.getWeight());
			megafauna.setSize(updateMega.getSize());
			megafauna.setDiet(updateMega.getDiet());
			megafauna.setHabitat(updateMega.getHabitat());
			megafauna.setRegion(updateMega.getRegion());
			
		
		
		
		return null;
		
		
		
		
		
		
	}

	@Override
	public Boolean delete(int id) {
		Megafauna mega = em.find(Megafauna.class, id);
		
		em.remove(mega);
		
		return null;
		
		
	}



}
