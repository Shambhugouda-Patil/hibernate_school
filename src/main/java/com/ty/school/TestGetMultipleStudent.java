package com.ty.school;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class TestGetMultipleStudent {
		public static void main(String[] args) {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			
			String sql= " SELECT s FROM Student s";
			
			Query query = entityManager.createQuery(sql);
			List<Student> list=query.getResultList();
			
			for(Student student : list)
			{
				System.out.println(("ID is :"+ student.getId()));
				System.out.println("Name is :"+student.getName());
				System.out.println("percentage is :"+student.getPercentage());
			}
			
			
		}

}
