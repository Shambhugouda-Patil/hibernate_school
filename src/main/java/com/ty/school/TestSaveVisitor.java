package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVisitor {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Visitor v=new Visitor();
		v.setId(3);
		v.setName("pawan");
		v.setEmail("pawan@123");
		v.setDob(LocalDate.of(1996, 07,26));
		v.setVisitDateTime(LocalDateTime.now());
		v.setGender("male");
		
		entityTransaction.begin();
		
		entityManager.persist(v);
		
		entityTransaction.commit();
		
		System.out.println("=======done========");
	}

}
