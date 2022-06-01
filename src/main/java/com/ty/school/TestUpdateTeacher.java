package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacher {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Teacher teacher= new Teacher();
				
				teacher.setId(3);
				teacher.setName("vikas");
				teacher.setEmail("vikas@123");
				teacher.setPhone(12345);
				teacher.setGender("male");
			
				   entityTransaction.begin();
					entityManager.merge(teacher);
					entityTransaction.commit();
				
				}

}
