package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestTeacherById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Teacher teacher=entityManager.find(Teacher.class, 2);
		if(teacher!=null)
		{
		System.out.println("ID is :" + teacher.getId());
		System.out.println("Name is :"+ teacher.getName());
		System.out.println("percentage is :"+teacher.getEmail());
		System.out.println("gender is :"+teacher.getGender());
		System.out.println("phone is:"+teacher.getPhone());
	}else {
		System.out.println("no student exist for given id");
	}
	}

}
