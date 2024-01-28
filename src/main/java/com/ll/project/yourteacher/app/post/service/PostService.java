package com.ll.project.yourteacher.app.post.service;

import com.ll.project.yourteacher.app.post.entity.Post;
import com.ll.project.yourteacher.app.post.entity.PostRequestDTO;
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

    public Post createPost(PostRequestDTO request) {
        // DTO로부터 엔티티 생성
        Post post = mapRequestToPost(request);

        // 저장 후 생성된 Post 반환
        return postRepository.save(post);
    }

    private Post mapRequestToPost(PostRequestDTO request) {
        Post post = new Post();
        post.setTitle(request.getTitle());
        post.setContent(request.getContent());

        // 여기에서 필요한 매핑 작업을 수행하도록 수정
        // post.setAuthor(request.getAuthor());
        // post.setCategory(request.getCategory());

        return post;
    }
}
