package com.ll.project.yourteacher.app.post.service;

import com.ll.project.yourteacher.app.post.entity.Post;
import com.ll.project.yourteacher.app.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    public List<Post> getPostsByCategoryId(Long categoryId) {
        return postRepository.findByCategoryId(categoryId);
    }
}
