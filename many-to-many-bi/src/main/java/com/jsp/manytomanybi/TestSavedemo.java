package com.jsp.manytomanybi;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class TestSavedemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Akshata");
		
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entitymanager.getTransaction();
		
		Student s1 = new Student();
        s1.setName("S1");
        s1.setEmail("s1@gmail.com");

        Student s2 = new Student();
        s2.setName("S2");
        s2.setEmail("s2@gmail.com");

        Student s3 = new Student();
        s3.setName("S3");
        s3.setEmail("s3@gmail.com");

        Student s4 = new Student();
        s4.setName("S4");
        s4.setEmail("s4@gmail.com");

        Student s5 = new Student();
        s5.setName("S5");
        s5.setEmail("s5@gmail.com");

        Course c1 = new Course();
        c1.setSubject("C1");
        c1.setDuration("30");

        Course c2 = new Course();
        c2.setSubject("C2");
        c2.setDuration("45");

        Course c3 = new Course();
        c3.setSubject("C3");
        c3.setDuration("50");
        
        List<Student> students1 = new ArrayList<>();
        students1.add(s1);
        students1.add(s2);

        List<Student> students2 = new ArrayList<>();
        students2.add(s3);
        students2.add(s4);
        students2.add(s5);
        
        List<Course> courses1 = new ArrayList<>();
        courses1.add(c1);
        courses1.add(c2);
        
        List<Course> courses2 = new ArrayList<>();
        courses2.add(c2);
        courses2.add(c3);

        List<Course> courses3 = new ArrayList<>();
        courses3.add(c1);
        courses3.add(c3);
      
        s1.setCourse(courses1);
        s2.setCourse(courses1);
        s3.setCourse(courses2);
        s4.setCourse(courses2);
        s5.setCourse(courses2);
     
        s1.getCourse().addAll(courses3);

        c1.setStudent(students1);
        c2.setStudent(students1);
        c2.setStudent(students2);
        c3.setStudent(students2);
      
        entityTransaction.begin();
        entitymanager.persist(s1);
        entitymanager.persist(s2);
        entitymanager.persist(s3);
        entitymanager.persist(s4);
        entitymanager.persist(s5);
       
        entityTransaction.commit();
		
		
		
}
}