package com.winson.spring.mvc;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author winson
 * @date 2022/1/11
 **/
public class MyHttpRequestListenerTwo implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletRequestListener.super.requestInitialized(sre);
        System.out.println("MyHttpRequestListenerTwo requestInitialized ----> " + sre.getServletRequest().getServerName());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        ServletRequestListener.super.requestDestroyed(sre);
        System.out.println("MyHttpRequestListenerTwo requestDestroyed ----> " + sre.getServletRequest().getServerName());
    }

}
