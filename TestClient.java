package com.mypack.employe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestClient {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("raj");
		EntityManager em=emf.createEntityManager();
		 em.getTransaction().begin();
		
		Student s=new Student();
		s.setId(107);
		s.setName("Saquib ansari");
		s.setFees(123);
		
		em.persist(s);
		em.getTransaction().commit();
		
		emf.close();
		em.close();

	}

}
