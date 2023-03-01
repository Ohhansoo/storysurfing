package com.sping;

import DataSource.Posts;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingApplication.class, args);
		System.out.println("hello sping");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try{
			Posts posts =new Posts();
			posts.setId(1L);
			posts.setAuthor("111");
			posts.setContent("2222");
			posts.setTitle("ll");

			em.persist(posts);

			tx.commit();

		}catch (Exception e){
			tx.rollback();
		}finally {
			em.close();
		}
		emf.close();

	}

}
