package com.sping.domain2.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usr")
public class UsrDTO {
    @Id
    private String usrid;

    private String name;
    private String nickname;
    private String pwd;

    public UsrDTO(String name, String nickname, String pwd){
        this.name = name;
        this.nickname = nickname;
        this.pwd = pwd;
    }

    public UsrDTO() {}
}
