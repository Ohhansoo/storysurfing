package com.sping.old;

import jakarta.annotation.PreDestroy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpingApplication {
//    private static SshTunneling tunnel;
    public SpingApplication() {
//        tunnel = new SshTunneling().init( res->{
//            if(!res) {
//                System.out.println("포트포워딩 실패, 프로그램을 종료 합니다.");
//                System.exit(0);
//            }
//        });
    }
    public static void main(String[] args) {
//        SpringApplication.run(SpingApplication.class, args);
//        System.out.println("hello sping");
        SpringApplication app = new SpringApplication(SpringBootApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);

    }

    @PreDestroy
    @Deprecated
    public void end() {
        try {
//            tunnel.closeSSH();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}