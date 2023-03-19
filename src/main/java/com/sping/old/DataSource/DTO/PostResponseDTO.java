package com.sping.old.DataSource.DTO;

import com.sping.old.Repository.Post;

public class PostResponseDTO {
    private Long id;
    private String title;
    private String contents;
    private String author;

    public PostResponseDTO(Post entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.contents = entity.getContent();
        this.author = entity.getAuthor();
    }
}