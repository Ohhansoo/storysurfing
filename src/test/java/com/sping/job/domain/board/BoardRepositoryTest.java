package com.sping.job.domain.board;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {
    @Autowired
    BoardRepository boardRepository;

    @After
    public void cleanup(){
        boardRepository.deleteAll();
    }

    @Test
    public void test1(){
        String title = "테스트 게시글";
        String content = "테스트 본문";

        boardRepository.save(Board.builder()
                            .title(title)
                            .content(content)
                            .author("hansoo")
                            .build()
        );

        //when
        List<Board> boardList = boardRepository.findAll();

        //then
        Board board = boardList.get(0);
        assertThat(board.getTitle().equals(title));
        assertThat(board.getTitle().equals(content));
    }
}
