package com.winson.spring.mvc.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author winson
 * @date 2022/1/13
 **/
public class HelloController implements Controller {

    static {
        System.out.println("HelloController static init()");
    }

    public HelloController() {
        System.out.println("HelloController construct init()");
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("HelloController --> handleRequest");
//        XmlWebApplicationContext acc = null;
//        acc.setConfigLocation();

        ModelAndView mv = new ModelAndView();
//        mv.setViewName("winson.html");
//        mv.setViewName("ciwei.jsp");
//        mv.setViewName("WEB-INF/winson.html");
        mv.setViewName("WEB-INF/ciwei2.jsp");
//        mv.setViewName("WEB-INF/page/winson.html");
        mv.addObject("companyName","ciwei");
        return mv;
    }

}
