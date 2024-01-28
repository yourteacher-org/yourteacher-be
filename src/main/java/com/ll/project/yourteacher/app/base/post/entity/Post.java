package com.ll.project.yourteacher.app.base.post.entity;

import com.ll.project.yourteacher.app.base.entity.BaseEntity;
import com.ll.project.yourteacher.app.base.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Post extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    private Member author;

    private String subject;
    private String content;

    public Post(long id) {
        super(id);
    }
}
