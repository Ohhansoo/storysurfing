package com.sping.config;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
    private SshTunneling sshConnection;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("init start!");
        try{
            sshConnection = new SshTunneling();
        }catch(Exception e) {
            e.printStackTrace();
        }
//        ServletContextListener.super.contextInitialized(sce);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("init destory!");
        try {
            sshConnection.closeSSH();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
