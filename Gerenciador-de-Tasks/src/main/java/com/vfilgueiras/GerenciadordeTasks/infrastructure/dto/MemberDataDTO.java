package com.vfilgueiras.GerenciadordeTasks.infrastructure.dto;

import lombok.Getter;

@Getter

public class MemberDataDTO {
    private String secret;
    private String name;
    private String email;

    public MemberDataDTO(String secret, String name, String email) {
        this.secret = secret;
        this.name = name;
        this.email = email;
    }

    public MemberDataDTO() {}
}
