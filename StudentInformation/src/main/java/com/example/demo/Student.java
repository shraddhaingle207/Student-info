
package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY )
	    private int id;
	    private String name;
	    private String email;
	    private String phone;

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

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
			name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", Name=" + name + ", email=" + email + ", phone=" + phone + ", getPhone()="
					+ getPhone() + ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}

		public Student orElse(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

	

	 
	}




