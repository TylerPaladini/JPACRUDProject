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

	@Override  // Locate megafauna using ID
	public Megafauna findById(int id) {
		Megafauna megafauna = em.find(Megafauna.class, id);
		
	
		return megafauna;
		
	}
	@Override
	public List<Megafauna> showAll() {
		//LIST ALL MEGAFAUNA
	   
	        
	        String queryStr = "SELECT mega FROM Megafauna mega";
	        List<Megafauna> listMegas = em.createQuery(queryStr, Megafauna.class).getResultList();
	        
	       
	    
		
		
		
		return listMegas;
	
		
		
	}
	
	
	@Override  // create a new megafauna
	public Megafauna create(Megafauna megafauna) {
		em.persist(megafauna);
		em.flush();
		em.close();
		
		return null;
	}

	@Override    // update existing megafauna
	public Boolean update (int id, Megafauna newMegafauna) {
		
		Megafauna toBeUpdateMega = em.find(Megafauna.class, id);
		
	
		
		
//		
//			megafauna.setName(updateMega.getName());
//			megafauna.setLatinScientific(updateMega.getLatinScientific());
//			megafauna.setDescription(updateMega.getDescription());
//			megafauna.setWeight(updateMega.getWeight());
//			megafauna.setSize(updateMega.getSize());
//			megafauna.setDiet(updateMega.getDiet());
//			megafauna.setHabitat(updateMega.getHabitat());
//			megafauna.setRegion(updateMega.getRegion());
			
			toBeUpdateMega.setName(newMegafauna.getName());
			toBeUpdateMega.setLatinScientific(newMegafauna.getLatinScientific());
			toBeUpdateMega.setDescription(newMegafauna.getDescription());
			toBeUpdateMega.setWeight(newMegafauna.getWeight());
			toBeUpdateMega.setSize(newMegafauna.getSize());
			toBeUpdateMega.setDiet(newMegafauna.getSize());
			toBeUpdateMega.setHabitat(newMegafauna.getHabitat());
			toBeUpdateMega.setRegion(newMegafauna.getHabitat());
			
		
		
		
		return null;
		
		
		
		
		
		
	}

	@Override  // delete megafauna from database table
	public Boolean delete(int id) {
		Megafauna mega = em.find(Megafauna.class, id);
		
		em.remove(mega);
		
		return null;
		
		
	}



}
