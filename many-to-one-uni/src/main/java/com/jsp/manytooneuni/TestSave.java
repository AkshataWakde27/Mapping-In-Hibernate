package com.jsp.manytooneuni;

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

		Person person = new Person();
		person.setName("ABC");
		person.setEmail("abc@gmail.com");
		person.setCno(1234567890l);
		person.setGender("Female");

		Account account1 = new Account();
		account1.setBank_name("SBI");
		account1.setIfsc_code("12345");
		account1.setAccno(123456789);

		Account account2 = new Account();
		account2.setBank_name("BOI");
		account2.setIfsc_code("12345");
		account2.setAccno(123456789);

		Account account3 = new Account();
		account3.setBank_name("HDFC");
		account3.setIfsc_code("12345");
		account3.setAccno(123456789);

		account1.setPerson(person);
		account2.setPerson(person);
		account3.setPerson(person);

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account1);
		entityManager.persist(account2);
		entityManager.persist(account3);
		entityTransaction.commit();

	}
}
