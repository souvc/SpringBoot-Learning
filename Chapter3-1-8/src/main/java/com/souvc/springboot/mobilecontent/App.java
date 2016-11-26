package com.souvc.springboot.mobilecontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 基于Spring提供支持不同设备的页面
 如果从桌面浏览器访问这个地址，则返回的页面中显示:Say hello from desktop
 如果从手机浏览器访问这个地址：则返回的页面中显示Say hello from mobile
 如果从平板电脑访问这个地址：则返回的页面中显示Say hello from tablets
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}