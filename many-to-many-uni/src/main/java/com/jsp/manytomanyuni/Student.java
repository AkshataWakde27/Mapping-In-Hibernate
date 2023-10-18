package com.jsp.manytomanyuni;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Student {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
		private String name;
		private String email;
		
		@ManyToMany
		List<Course> cources;

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

		public List<Course> getCources() {
			return cources;
		}

		public void setCources(List<Course> cources) {
			this.cources = cources;
		}
		
		
}