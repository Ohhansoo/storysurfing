package com.sping.DataSource.DTO;

import com.sping.Repository.Post;

public class PostsResponseDTO {
    private Long id;
    private String title;
    private String contents;
    private String author;

    public PostsResponseDTO(Post entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.contents = entity.getContent();
        this.author = entity.getAuthor();
    }
}