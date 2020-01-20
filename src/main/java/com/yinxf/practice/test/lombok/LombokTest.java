package com.yinxf.practice.test.lombok;

/**
 * @author yinxf
 * @Date 2019/12/9
 * @Description lombok
 **/
public class LombokTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("zhangsan");
        person.setFriendly(true);
        System.out.println(person.toString());
    }
}
