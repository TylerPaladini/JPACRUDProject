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
		Megafauna megafauna = em.find(Megafauna.class, 1);
		
	
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
		
		if(updateMega != null) {
			updateMega.getName();
			updateMega.getLatinScientific();
			updateMega.getDescription();
			updateMega.getWeight();
			updateMega.getSize();
			updateMega.getDiet();
			updateMega.getHabitat();
			updateMega.getRegion();
			
		}
		
		
		em.close();
		return null;
		
		
		
		
		
		
	}

	@Override
	public Boolean delete(int id) {
		Megafauna mega = em.find(Megafauna.class, id);
		
		em.remove(mega);
		
		return null;
		
		
	}



}
