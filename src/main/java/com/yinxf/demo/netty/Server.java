package com.yinxf.demo.netty;

import io.netty.bootstrap.ServerBootstrap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yinxf
 * @Date 2019/2/25
 * @Description
 **/
public class Server {

    public static void main(String[] args) {
        //服务类
        ServerBootstrap bootstrap = new ServerBootstrap();

        ExecutorService boss = Executors.newCachedThreadPool();
        ExecutorService worker = Executors.newCachedThreadPool();



    }
}
