package com.yinxf.practice.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yinxf
 * @Date 2019/4/12
 * @Description
 **/
public class Test {


    public static void main(String[] args) {
//        cpuMap100();
//        getThreadNum();


        lambdaAndEach();

        System.out.println("end");
    }

    static List<Integer> integers = new ArrayList<>(10000000);
    private static void lambdaAndEach() {
        for (int i = 0; i < 10000000; i++) {
            integers.add(new Random().nextInt(10000000));
        }

        System.out.println("init  end!!!");
        long start = System.currentTimeMillis();
        System.out.println("普通for循环开始遍历！！");
        int max = Integer.MIN_VALUE ;
        for (Integer n : integers) {
            max = Integer.max(max, n);
        }

        System.out.println("普通for循环遍历结束！！！耗时："+(System.currentTimeMillis()-start));

        start = System.currentTimeMillis();

        System.out.println("lambda开始遍历！！");
        integers.stream().reduce(Integer.MIN_VALUE,(a,b)->Integer.max(a,b));
        System.out.println("lambda遍历结束！！！耗时："+(System.currentTimeMillis()-start));


    }

    private static void getThreadNum(){
        System.out.println("hello world!");

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] allThreadIds = threadMXBean.getAllThreadIds();
        ThreadInfo[] threadInfo = threadMXBean.getThreadInfo(allThreadIds);
        for (ThreadInfo info : threadInfo) {
            System.out.println(info.getThreadId()+"===="+info.getThreadName());
        }
    }
    /**
     * ConcurrentHashMap 在JDK1.8中 这个computeIfAbsent方法，容易导致CPU 100%
     */
    private static void cpuMap100() {
        Map<String ,String> map = new ConcurrentHashMap<>();
        map.computeIfAbsent("AaAa",key-> map.computeIfAbsent("BBBB",key2 -> "value"));
    }
}
