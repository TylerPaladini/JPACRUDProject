package com.skilldistillery.megafauna.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MegafaunaTests {
	private static EntityManagerFactory emf;
	private EntityManager em;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("Megafauna");
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
	}

	@Test
	@DisplayName("test megafauna entity is connected with database")
	void test() {
		Megafauna megafauna = em.find(Megafauna.class, 1);
		assertEquals("Bear", megafauna.getName());
		assertEquals("test", megafauna.getLatinScientific());
		
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}

	@AfterAll
	static void teardownAll() throws Exception {
		emf.close();
	}
}
