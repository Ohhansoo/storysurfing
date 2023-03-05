package com.sping;

import com.sping.DataSource.DTO.PostSaveRequestDTO;
import com.sping.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostApiController {
    private final PostService postService;

    @PostMapping("/saveForm/post")
    public Long save(@RequestBody PostSaveRequestDTO requestDTO){
        return postService.save(requestDTO);
    }
}