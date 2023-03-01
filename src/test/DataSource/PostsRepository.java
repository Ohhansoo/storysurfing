package DataSource;

import org.springframework.data.jpa.repository.JpaRepository;

/*
보통 ibatis나 MyBatis 등에서 Dao라고 불리는 DB Layer 접근자입니다.
JPA에선 Repository라고 부르며 인터페이스로 생성합니다.
인터페이스 생성 후 JpaRepository<Entity 클래스,PK 타입>을 상속하면 기본적인 CRUD 메소드가 자동으로 생성된다.
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
        }