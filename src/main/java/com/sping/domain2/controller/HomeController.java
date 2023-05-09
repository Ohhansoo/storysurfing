package com.sping.domain2.controller;

import jakarta.servlet.http.HttpServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController extends HttpServlet {
    private Logger log = LoggerFactory.getLogger(getClass());

//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String hello() {
//        return "ok";
//
//    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";

    }
}
