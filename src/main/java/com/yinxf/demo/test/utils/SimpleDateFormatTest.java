package com.yinxf.demo.test.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yinxf
 * @Date 2019/4/2
 * @Description
 **/
public class SimpleDateFormatTest {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");


    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(100);

        for (int i =0;i<20;i++){
            service.execute(()->{
                for (int j =  0;j<10;j++){
                    try {
                        System.out.println(parse("2019-04-02 17:35:35"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }


    private static String format(Date date){
        return sdf.format(date);
    }

    private static Date parse(String date) throws ParseException {
        return sdf.parse(date);
    }
}
