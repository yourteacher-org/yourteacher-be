package com.ll.project.yourteacher.app.category.entity;

import com.ll.project.yourteacher.app.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Category extends BaseEntity {
    public Category(long id) {
        super(id);
    }
}
