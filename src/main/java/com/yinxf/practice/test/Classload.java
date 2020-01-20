package com.yinxf.practice.test;

import sun.misc.Launcher;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author yinxf
 * @Date 2019/12/16
 * @Description 启动类加载器、扩展类加载器、应用系统类加载器的加载路径
 **/
public class Classload {
    public static void main(String[] args) {
        System.out.println("启动类加载器");
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }

        System.out.println("-----------------------");

        System.out.println("扩展类加载器");

        URLClassLoader extClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader().getParent();
        System.out.println(extClassLoader);
        System.out.println("扩展类加载器的加载路径");
        urLs = extClassLoader.getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }
        System.out.println("--------------------------");

        URLClassLoader appClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        System.out.println(appClassLoader);
        urLs = appClassLoader.getURLs();

        System.out.println("应用系统类加载器的加载路径");
        for (URL urL : urLs) {
            System.out.println(urL);
        }
        System.out.println("------------------------------");


    }
}
