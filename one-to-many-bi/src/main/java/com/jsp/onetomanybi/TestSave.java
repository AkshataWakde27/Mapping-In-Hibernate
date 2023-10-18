package com.jsp.onetomanybi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Akshata");   	
	EntityManager entityManager=entityManagerFactory.createEntityManager();  

	EntityTransaction entityTransaction=entityManager.getTransaction();    
	
	
	Bank bank=new Bank();
	bank.setName("SBI");
	
	Branch b1=new Branch();
	b1.setAddress("Dadar");
	
	
	Branch b2=new Branch();
	b2.setAddress("Parel");
	
	
	Branch b3=new Branch();
	b3.setAddress("Thane");
	
	Branch b4=new Branch();
	b4.setAddress("Vashi");
	
	List<Branch>branches=new ArrayList<Branch>();
	branches.add(b1);
	branches.add(b2);
	branches.add(b3);
	branches.add(b4);
	
	bank.setBranches(branches);
	
	b1.setBank(bank);
	b2.setBank(bank);
	b3.setBank(bank);
	b4.setBank(bank);
	
	
	
	entityTransaction.begin();
	entityManager.persist(bank);
//	entityManager.persist(b1);
//	entityManager.persist(b2);
//	entityManager.persist(b3);
//	entityManager.persist(b4);
	entityTransaction.commit();
	
	
}

	
	
	
	
	
	
	
}

