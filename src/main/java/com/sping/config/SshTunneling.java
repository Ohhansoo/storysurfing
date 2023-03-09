package com.sping.config;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.util.function.Consumer;

public class SshTunneling {

    private static JSch jsch = new JSch();

    private String url = "43.201.122.223";
    private String username = "ec2-user";
    private String password = "1q2w#e$r";
    private int port = 22;  //ssh포트
    private int lport = 3306;  //원격 접속 후 가상으로 포워딩할 포트
    private int rport = 3306;  //실제 사용할 데이터베이스 포트
    private Session session;

    public SshTunneling init(Consumer<Boolean> arg) {
        try {
            session = jsch.getSession(username, url, port);
            session.setPassword(password);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
//            session.setPortForwardingL(lport, "127.0.0.1", rport);
            session.setPortForwardingL(lport, "43.201.122.223", rport);
            arg.accept(true);
        } catch (Exception e) {
            arg.accept(false);
        }
        return this;
    }

    public void closeSSH() throws Exception {
        if (session != null && session.isConnected()) {
            session.disconnect();
        }
    }
}