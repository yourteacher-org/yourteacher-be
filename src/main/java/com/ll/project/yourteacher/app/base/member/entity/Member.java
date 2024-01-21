package com.ll.project.yourteacher.app.base.member.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ll.project.yourteacher.app.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Member {
    private Long id;

    @NotEmpty
    private String loginId;

    @Column(unique = true)
    private String nickname;

    @JsonIgnore
    private String password;

    @Column(unique = true)
    private String email;

    public void setId(long l) {
    }


}
