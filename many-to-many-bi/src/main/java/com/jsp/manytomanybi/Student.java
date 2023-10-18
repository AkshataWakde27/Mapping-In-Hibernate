package com.jsp.manytomanybi;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
		private int id;
		private String name;
		private String email;
		
		@ManyToMany(mappedBy = "student", cascade = CascadeType.ALL )
		private List<Course>course;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public List<Course> getCourse() {
			return course;
		}

		public void setCourse(List<Course> course) {
			this.course = course;
		}
		
		

}
