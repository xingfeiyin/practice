package com.yinxf.practice.test.lock;

import java.util.Date;
import java.util.concurrent.locks.StampedLock;

/**
 * @author yinxf
 * @Date 2019/8/9
 * @Description   StampedLock
 **/
public class StampedSimple {
    private final StampedLock sl = new StampedLock();

    void mitate(){
        long stamp = sl.writeLock();
        try {
            //业务逻辑

        }finally {
            sl.unlockWrite(stamp);
        }
    }

    Date access(){

        long stamp = sl.tryOptimisticRead();
        Date date = read();
        if (!sl.validate(stamp)){
            stamp = sl.readLock();
            try {
                date = read();
            }finally {
                sl.unlockRead(stamp);
            }
        }
        return date;
    }

    private Date read() {
        return new Date();
    }
}
