package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestVisitorById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Visitor visitor = entityManager.find(Visitor.class, 2);
		if (visitor != null) {
			System.out.println("ID is :" + visitor.getId());
			System.out.println("Name is :" + visitor.getName());
			System.out.println("email is :" + visitor.getEmail());
			System.out.println("dob is :" + visitor.getDob());
			System.out.println("visit date time is :" + visitor.getVisitDateTime());
			System.out.println("gender is :" + visitor.getGender());
		} else {
			System.out.println("no student exist for given id");
		}
	}

}
