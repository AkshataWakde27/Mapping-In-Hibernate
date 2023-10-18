package com.jsp.manytomanyuni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Akshata");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student s = new Student();
		s.setName("ABC");
		s.setEmail("abc@gmail.com");
		
		
		Course c1=new Course();
		c1.setName("Java");
		c1.setDuration(2);
		
		Course c2=new Course();
		c2.setName("SQL");
		c2.setDuration(1);
		
		Course c3=new Course();
		c3.setName("WebTech");
		c3.setDuration(3);
				
		ArrayList courses=new ArrayList();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		s.setCources(courses);
		

		entityTransaction.begin();
		entityManager.persist(s);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		entityTransaction.commit();

	}
}
