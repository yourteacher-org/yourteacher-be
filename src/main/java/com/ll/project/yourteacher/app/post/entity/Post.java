package com.ll.project.yourteacher.app.post.entity;

import com.ll.project.yourteacher.app.base.entity.BaseEntity;
import com.ll.project.yourteacher.app.category.entity.Category;
import com.ll.project.yourteacher.app.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    private Member author;

    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    public Post() {
        super();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(Member author) {
        this.author = author;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
