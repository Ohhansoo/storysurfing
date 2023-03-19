package com.sping.user.dto;

import com.sping.user.domain.Repository.User;
import jakarta.persistence.Column;

public class UserResponseDTO {
    private Long id;
    private String gradeId;
    private String active;
    private String name;
    private String passWord;
    private String point;
    private String phoneNumber;
    private String socialLogin1;
    private String socialLogin2;
    private String socialLogin3;
    private String isAdminYN;
    private String loginCount;
    private String loginedTime;

    public UserResponseDTO(User entity){
        this.gradeId = gradeId;
        this.active = active;
        this.name = name;
        this.passWord = passWord;
        this.point = point;
        this.phoneNumber = phoneNumber;
        this.socialLogin1 = socialLogin1;
        this.socialLogin2 = socialLogin2;
        this.socialLogin3 = socialLogin3;
        this.isAdminYN = isAdminYN;
        this.loginCount = loginCount;
        this.loginedTime = loginedTime;
    }
}