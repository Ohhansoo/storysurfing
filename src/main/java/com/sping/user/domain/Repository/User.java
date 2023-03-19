package com.sping.user.domain.Repository;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
//@Table(name="Post")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String gradeId;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String active;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String name;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String passWord;
    @Column(columnDefinition = "TEXT")
    private String point;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String phoneNumber;
    @Column(columnDefinition = "TEXT")
    private String socialLogin1;
    @Column(columnDefinition = "TEXT")
    private String socialLogin2;
    @Column(columnDefinition = "TEXT")
    private String socialLogin3;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String isAdminYN;
    @Column(columnDefinition = "Number", nullable = false)
    private String loginCount;
    @Column(columnDefinition = "Date", nullable = false)
    private String loginedTime;

    @Builder
    public User(String gradeId, String active, String name, String passWord, String point, String phoneNumber, String socialLogin1, String socialLogin2, String socialLogin3, String isAdminYN, String loginCount, String loginedTime) {
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
