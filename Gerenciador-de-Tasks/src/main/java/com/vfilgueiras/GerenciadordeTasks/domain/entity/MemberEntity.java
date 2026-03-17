package com.vfilgueiras.GerenciadordeTasks.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Builder

public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "member_id", nullable = false)
    private String id;

    @Column(name = "member_secret_key", nullable = false, length = 36)
    private String secret;

    @Column(name = "member_username", nullable = false, length = 36)
    private String name;

    @Column(name = "member_email", nullable = false, length = 256)
    private String email;

    public MemberEntity(String secret, String name, String email) {
        this.secret = secret;
        this.name = name;
        this.email = email;
    }

    public MemberEntity() {}
}
