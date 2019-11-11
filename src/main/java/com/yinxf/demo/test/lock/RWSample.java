package com.yinxf.demo.test.lock;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author yinxf
 * @Date 2019/8/9
 * @Description   ReentrantReadWriteLock
 **/
public class RWSample {

    private final Map<String,String> m = new TreeMap<>();
    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();

    public String get(String key){
        r.lock();
        System.out.println("read lock!");
        try {
            return m.get(key);
        } finally {
            r.unlock();
        }
    }


    public String put(String key,String value){
        w.lock();
        System.out.println("write lock!");
        try {
            return m.put(key,value);
        } finally {
            w.unlock();
        }
    }
}
