package com.sping.old.controller;

import com.sping.old.DataSource.DTO.PostSaveRequestDTO;
import com.sping.old.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @RequestMapping("/Post")
    public void savePosts(@RequestBody PostSaveRequestDTO dto){
        postRepository.save(dto.toEntity());
    }
}
