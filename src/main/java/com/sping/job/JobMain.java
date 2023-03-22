package com.sping.job;

import com.sping.job.domain.board.Board;
import com.sping.job.domain.board.BoardRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JobMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sping");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        BoardRepository boardRepository;
        tx.begin();

        try{
            Board boards =new Board();

            boards.setAuthor("오한수");
            boards.setContent("되나??");
            boards.setTitle("두번째 테스트");
            em.persist(boards);
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
