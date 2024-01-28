package com.ll.project.yourteacher.app.base.member.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ll.project.yourteacher.app.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Member extends BaseEntity {
    private Long id;

    @NotEmpty
    private String loginId;

    @Column(unique = true)
    private String nickname;

    @JsonIgnore
    private String password;

    @Column(unique = true)
    private String email;

    public Member(long id) {
        super(id);
    }

}
