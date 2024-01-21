package com.ll.project.yourteacher.app.base.member.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ll.project.yourteacher.app.base.entity.BaseEntity;
import jakarta.persistence.Column;

public class Member extends BaseEntity {
    @Column(unique = true)
    private String username;

    @JsonIgnore
    private String password;

    @Column(unique = true)
    private String email;

    public Member(long id) {
        super(id);
    }
}
