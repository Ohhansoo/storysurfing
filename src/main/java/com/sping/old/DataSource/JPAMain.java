package com.sping.old.DataSource;

import com.sping.old.Repository.Post;
import com.sping.old.Repository.PostRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JPAMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sping");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        PostRepository postRepository;
        tx.begin();

        try{
            Post posts =new Post();

            posts.setAuthor("ohoh");
            posts.setContent("xml체인지");
            posts.setTitle("ll");
            em.persist(posts);
            em.flush();
            tx.commit();

        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
