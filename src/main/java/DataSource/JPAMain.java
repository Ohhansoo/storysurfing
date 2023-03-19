package DataSource;

import com.sping.Repository.Post;
import com.sping.Repository.PostRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JPAMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        PostRepository postRepository;
        tx.begin();

        try {
            Post posts = new Post();

            posts.setAuthor("오한수");
            posts.setContent("config설정 없이 실행");
            posts.setTitle("11");
            em.persist(posts);
            em.flush();
            tx.commit();
        }
        catch(Exception e) {
            tx.rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
            emf.close();
    }
}
