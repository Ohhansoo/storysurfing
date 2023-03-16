package com.sping.old.DataSource.DTO;

import com.sping.old.Repository.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PostSaveRequestDTO {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostSaveRequestDTO(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Post toEntity(){
        return Post.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}