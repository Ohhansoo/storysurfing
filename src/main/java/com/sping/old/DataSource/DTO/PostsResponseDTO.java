package com.sping.old.DataSource.DTO;

import com.sping.old.Repository.Post;

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