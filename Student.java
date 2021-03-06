package com.mypack.employe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  
public class Student {

	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;  
	    private String name;  
	    private long fees;  
	
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

		public long getFees() {
			return fees;
		}

		public void setFees(long fees) {
			this.fees = fees;
		}

	public Student() {
		
	}

}
