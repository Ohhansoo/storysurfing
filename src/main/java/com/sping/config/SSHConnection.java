package com.sping.config;

import java.util.Properties;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SSHConnection {
    private final static String HOST = "43.201.122.223";
    private final static Integer PORT = 22;
    private final static String SSH_USER = "ec2-user";
    private final static String SSH_PW = "1q2w#e$r";

    private Session session;

    public void closeSSH() {
        session.disconnect();
    }

    public SSHConnection() {
        try {
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            session = jsch.getSession(SSH_USER, HOST, PORT);
            session.setPassword(SSH_PW);
            session.setConfig(config);
            session.connect();
            session.setPortForwardingL(3306, "127.0.0.1", 3306);
        } catch (JSchException e) {
            e.printStackTrace();
        }

    }
}