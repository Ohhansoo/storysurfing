package com.sping.controller;

import com.sping.DataSource.DTO.PostSaveRequestDTO;
import com.sping.Repository.PostRepository;
import org.springframework.web.bind.annotation.RequestBody;

public class PostController {
    private PostRepository postRepository;

    public void savePosts(@RequestBody PostSaveRequestDTO dto){
        postRepository.save(dto.toEntity());
    }
}
