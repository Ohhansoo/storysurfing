package com.sping.user.dto;

import com.sping.user.domain.Repository.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserSaveRequestDTO {
    private String gradeId;
    private String active; String name;
    private String passWord;
    private String point;
    private String phoneNumber;
    private String socialLogin1;
    private String socialLogin2;
    private String socialLogin3;
    private String isAdminYN;
    private String loginCount;
    private String loginedTime;
    @Builder
    public UserSaveRequestDTO(String gradeId, String active, String name, String passWord, String point, String phoneNumber, String socialLogin1, String socialLogin2, String socialLogin3, String isAdminYN, String loginCount, String loginedTime){
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

    public User toEntity(){
        return User.builder()
                .gradeId(gradeId)
                .active(active)
                .name(name)
                .passWord(passWord)
                .point(point)
                .phoneNumber(phoneNumber)
                .socialLogin1(socialLogin1)
                .socialLogin2(socialLogin2)
                .socialLogin3(socialLogin3)
                .isAdminYN(isAdminYN)
                .loginCount(loginCount)
                .loginedTime(loginedTime).build();
    }
}