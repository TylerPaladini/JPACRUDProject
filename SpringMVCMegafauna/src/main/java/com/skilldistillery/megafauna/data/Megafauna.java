package com.skilldistillery.megafauna.data;

import java.util.List;

public interface Megafauna {
	Megafauna findById(int id);
	List<Megafauna> findAll();
	Megafauna add(Megafauna m);
	Megafauna update(Megafauna m);
	boolean delete(Megafauna m);
	boolean deleteById(Megafauna m);
	
	

}
