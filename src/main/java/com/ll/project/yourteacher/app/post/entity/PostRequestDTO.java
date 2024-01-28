package com.ll.project.yourteacher.app.post.entity;

import com.ll.project.yourteacher.app.member.entity.Member;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class PostRequestDTO {
    private String title;
    private String content;
    private Long categoryId;
    private Member author;
}
