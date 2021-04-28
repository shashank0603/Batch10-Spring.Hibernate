package com.tyss.hibernate.springcore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.hibernate.movie.Movie;
import com.te.spring.config.AllConfig;

public class MovieTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Movie movie = context.getBean(Movie.class);
		int id = movie.getId();
		String name = movie.getName();
		System.out.println(movie.getActor().getAct_id());
		System.out.println(movie.getActor().getAct_name());
		((AbstractApplicationContext)context).close();
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction =null;
		
		entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		String query = "update movie set moviesname="+ name + "where id = "+id;
		Query q1 = entityManager.createQuery(query);
		int count = q1.executeUpdate();
		entityTransaction.commit();
		System.out.println(count);
	}
}
