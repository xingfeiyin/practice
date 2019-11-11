package com.yinxf.practice.test.arithmetic;

import com.alibaba.fastjson.JSON;

/**
 * @author yinxf
 * @Date 2019/3/15
 * @Description 最小堆实现
 **/
public class MinHeap {
    //堆的存储结构
    private int[] data;

    //将一个数组传入构造方法，并转换成一个小根堆
    public MinHeap(int[] data) {
        this.data = data;
        createHeap();
    }

    //将数组转换成小根堆
    public void createHeap() {
        /**
         * 完全二叉树只有数组下标小于或等于(data.length) / 2 - 1 的元素有孩子结点，遍历这些结点
         *
         * 比如 数组中有10个元素，(data.length) / 2 - 1 的值为4，a[4]有孩子结点，但a[5]没有
         */
        for (int i = (data.length) / 2 - 1; i >= 0; i--) {
            //对有孩子结点的元素heapIfy
            heapIfy(i);
        }
    }

    public void heapIfy(int value) {
        //获取左右结点的数组下标
        int lchild = left(value);
        int rchild = right(value);
//        System.out.println(String.format("数组下标孩子结点：value=%s,lchild=%s,rchild=%s",value,lchild,rchild));
        //这是一个临时变量，表示根节点、左结点、右结点中最小的值的结点的下标
        int smallest = value;
        //存在左结点，且左结点的值小于根节点的值
        if (lchild < data.length && data[lchild] < data[value])
            smallest = lchild;
        //存在右结点，且右结点的值小于以上比较的较小值
        if (rchild < data.length && data[rchild] < data[smallest])
            smallest = rchild;
        //左右结点的值都大于根节点，直接return ，不做任何操作
        if (value == smallest)
            return;
        //交换根节点和左右节点中最小的那个值，把根节点的值替换下去
        swap(value, smallest);

        //由于替换后左右子树会被影响，所以要对受影响的子树再进行heapIfy
        heapIfy(smallest);
    }

    //获取左结点的数组下标
    public int left(int value) {
        return ((value + 1) << 1) - 1;
    }

    //获取右结点的数组下标
    public int right(int value) {
        return (value + 1) << 1;
    }

    //交换元素位置
    public void swap(int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    //获取树中的最小元素，根元素
    public int getRoot() {
        return data[0];
    }

    //替换根元素，并重新heapIfy
    public void setRoot(int value) {
        data[0] = value;
        heapIfy(0);
    }

    public static void main(String[] args) {
        // 源数据
        int[] data = {56,275,12,6,45,478,41,1236,456,12,546,45};

        // 获取Top5
        int[] top5 = topK(data, 5);

        for(int i=0;i<5;i++) {
            System.out.println(top5[i]);
        }

    }

    // 从data数组中获取最大的k个数
    private static int[] topK(int[] data,int k) {
        // 先取K个元素放入一个数组topk中
        int[] topk = new int[k];
        for (int i = 0; i < k; i++) {
            topk[i] = data[i];
        }

        System.out.println("初始数组："+JSON.toJSONString(topk));
        // 转换成最小堆
        MinHeap heap = new MinHeap(topk);
        System.out.println("转换成小根堆后的数组："+JSON.toJSONString(topk));

        // 从k开始，遍历data
        for (int i = k; i < data.length; i++) {
            int root = heap.getRoot();
            System.out.println(i+"根节点"+root);
            // 当数据大于堆中最小的数（根节点）时，替换堆中的根节点，再转换成堆
            if (data[i] > root) {
                heap.setRoot(data[i]);
                System.out.println("tihuanhoud"+JSON.toJSONString(topk));
            }
        }
        System.out.println("完成遍历后的数组："+JSON.toJSONString(topk));
        return topk;

    }

}
