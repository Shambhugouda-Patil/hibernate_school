package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student= new Student();
				
				student.setId(4);
				student.setName("nishant");
				student.setPercentage(91.00);
			
				   entityTransaction.begin();
					entityManager.merge(student);
					entityTransaction.commit();
				
				}
	}


