package com.sping.services;

import DataSource.PostRepository;
import com.sping.dto.PostSaveRequestDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Long save(PostSaveRequestDTO requestDTO){
        return postRepository.save(requestDTO.toEntity()).getId();
    }
}
