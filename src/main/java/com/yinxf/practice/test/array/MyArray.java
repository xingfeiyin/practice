package com.yinxf.practice.test.array;

/**
 * @author yinxf
 * @Date 2019/6/3
 * @Description
 **/
public class MyArray {
    private int[] array;
    private int size ;

    public MyArray(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }

    public void insert(int ele , int index){
        for (int i = size-1; i >= index ; i--) {
            array[i+1] = array[i];
        }
        array[index] = ele;
        size++;
    }

    private void output(){
        for (int i = 0; i < size ; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        MyArray myArray = new MyArray(10);
        myArray.insert(3,0);
        myArray.insert(6,1);
        myArray.insert(9,2);
        myArray.insert(7,3);
        myArray.insert(5,1);
        myArray.insert(4,1);
        myArray.output();

    }
}
