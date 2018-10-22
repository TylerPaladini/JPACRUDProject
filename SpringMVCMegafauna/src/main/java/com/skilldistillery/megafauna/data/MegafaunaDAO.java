package com.skilldistillery.megafauna.data;

import java.util.List;

import com.skilldistillery.megafauna.entities.Megafauna;

public interface MegafaunaDAO {
	
	public Megafauna findById(int id);
	
	public List<Megafauna> showAll();

	public Megafauna create(Megafauna megafauna);
	
	public Boolean update(int id, Megafauna megafauna);
	
	public Boolean delete(int id);
		

	

}
