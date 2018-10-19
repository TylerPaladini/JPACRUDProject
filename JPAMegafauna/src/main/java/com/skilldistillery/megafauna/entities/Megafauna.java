package com.skilldistillery.megafauna.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Megafauna {

	@Entity
	public class megafauna{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)	
		private int id;
		
		private String name;
		private String latinScientific;
	}
}
