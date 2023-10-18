package com.jsp.manytomanybi;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class TestSave {
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

       
        Course c1 = new Course();
        c1.setSubject("C1");
        c1.setDuration("30");

        Course c2 = new Course();
        c2.setSubject("C2");
        c2.setDuration("45");

        Course c3 = new Course();
        c3.setSubject("C3");
        c3.setDuration("50");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

       
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);


        s1.setCourse(courses);
        s2.setCourse(courses);
        s3.setCourse(courses);
        

        c1.setStudent(students);
        c2.setStudent(students);
        c3.setStudent(students);
       

        entityTransaction.begin();
        entitymanager.persist(s1);
        entitymanager.persist(s2);
        entitymanager.persist(s3);
        entityTransaction.commit();
		
		
		
}
}