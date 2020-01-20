package com.yinxf.practice.test.lombok;

import lombok.Data;

/**
 * @author yinxf
 * @Date 2019/12/9
 * @Description lombok
 **/
@Data
public class Person {
    private String name;
    private int age;
    private boolean friendly;
}
