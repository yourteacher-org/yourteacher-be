package com.ll.project.yourteacher.app.post.controller;

import com.ll.project.yourteacher.app.post.entity.Post;
import com.ll.project.yourteacher.app.post.repository.PostRepository;
import com.ll.project.yourteacher.app.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getPostsByCategoryId(@RequestParam Long categoryId) {
        List<Post> posts = postService.getPostsByCategoryId(categoryId);

        Map<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("message", "성공");
        Map<String, Object> result = new HashMap<>();
        result.put("posts", posts);
        response.put("result", result);

        return ResponseEntity.ok(response);
    }
}
