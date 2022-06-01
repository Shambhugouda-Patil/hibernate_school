package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacher {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Teacher t=new Teacher();
	t.setId(3);
	t.setName("satish");
	t.setEmail("satish@900");
	t.setPhone(567890);
	t.setGender("male");
	
	
	entityTransaction.begin();
	
	entityManager.persist(t);
	
	entityTransaction.commit();
	
	System.out.println("=======done========");
}
}
