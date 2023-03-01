package com.sping.dto;

import DataSource.Posts;

public class PostsResponseDTO {
    private Long id;
    private String title;
    private String contents;
    private String author;

    public PostsResponseDTO(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.contents = entity.getContent();
        this.author = entity.getAuthor();
    }
}
