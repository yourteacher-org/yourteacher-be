package com.ll.project.yourteacher.app.comment.entity;

import com.ll.project.yourteacher.app.base.entity.BaseEntity;
import com.ll.project.yourteacher.app.member.entity.Member;
import com.ll.project.yourteacher.app.post.entity.Post;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class Comment extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    private Member author;

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    private String content;

    public Comment(long id) {
        super(id);
    }
}
