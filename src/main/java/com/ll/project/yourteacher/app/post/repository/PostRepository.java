package com.ll.project.yourteacher.app.post.repository;

import com.ll.project.yourteacher.app.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

}
