package com.yinxf.practice.test.array;

import com.alibaba.fastjson.JSON;


/**
 * @author yinxf
 * @Date 2020/1/2
 * @Description 两个有序数组合并成一个有序数组
 **/
public class TwoArraySort {

    public static void main(String[] args) {
        int[] arr1 = {3,5};
        int[] arr2 = {1,2,4};

        int[] arr3 = method1(arr1,arr2,arr1.length,arr2.length);
        System.out.println(JSON.toJSONString(arr3));
//        int[] arr4 = method2(arr1,arr2,arr1.length,arr2.length);
//        System.out.println(JSON.toJSONString(arr4));

    }

//    private static int[] method2(int[] arr1, int[] arr2, int length1, int length2) {
//        int[] arr3 = new int[length1+length2];
//
//        int index = 0;
//        int i=0,j = 0;
//
//        a:for ( ; i < length1; i++) {
//            for ( ; j < length2; j++) {
//                if (arr1[i] >= arr2[j]){
//                    arr3[index] = arr2[j];
//                    index++;
//                    continue;
//                }
//                if (arr1[i] < arr2[j]){
//                    arr3[index] = arr1[i];
//                    index++;
//                    break ;
//                }
//            }
//        }
//
//        return arr3;
//    }

    private static int[] method1(int[] arr1, int[] arr2,int length1,int length2) {
        int[] arr3 = new int[length1+length2];
        int index1 = 0,index2=0,index3=0;

        while (index1 != length1 || index2 != length2){

            if (index1 == length1){
                arr3[index3] = arr2[index2];
                index2++;
                index3++;
                continue;
            }

            if (index2 == length2){
                arr3[index3] = arr1[index1];
                index1++;
                index3++;
                continue;
            }

            int temp1 = arr1[index1];
            int temp2 = arr2[index2];

            if (temp1 >= temp2){
                arr3[index3] = temp2;
                index3++;
                index2++;
                continue;
            }

            if (temp1 < temp2){
                arr3[index3] = temp1;
                index3++;
                index1++;
                continue;
            }
        }
        return arr3;
    }
}
