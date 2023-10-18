package com.jsp.person.adhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestControl {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entitymanager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entitymanager.getTransaction();
	
	Person person=new Person();
	person.setName("xyz");
	person.setEmail("xyz@gmail.com");
	
	Adhar aadhar=new Adhar();
	aadhar.setAadhar_no(1234);
	aadhar.setCity("mumbai");
	
	aadhar.setPerson(person);
	entityTransaction.begin();
	entitymanager.persist(person);
	entitymanager.persist(aadhar);
	entityTransaction.commit();
	
	
	
	
}
}




