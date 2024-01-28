package com.ll.project.yourteacher.app.post.entity;

import com.ll.project.yourteacher.app.base.entity.BaseEntity;
import com.ll.project.yourteacher.app.category.entity.Category;
import com.ll.project.yourteacher.app.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class Post extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    private Member author;

    private String subject;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    public Post(long id) {
        super(id);
    }
}
