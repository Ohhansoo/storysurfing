package com.sping.user.controller;

import com.sping.old.DataSource.DTO.PostSaveRequestDTO;
import com.sping.old.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private PostRepository postRepository;

    @RequestMapping("/Post")
    public void savePosts(@RequestBody PostSaveRequestDTO dto){
        postRepository.save(dto.toEntity());
    }
}
