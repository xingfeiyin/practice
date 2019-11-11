package com.yinxf.practice.designpattern.state;

/**
 * @author yinxf
 * @Date 2019/11/4
 * @Description 状态模式
 *
 * 状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 *      状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况，把状态的判断逻辑转移到表示
 *      不同状态的一系列类当中，可以把复杂的判断逻辑简化。
 *
 * 状态模式好处：
 * 1.将与特定状态相关的行为局部化，并且将不同状态的行为分割开来
 * 2.将特定的状态相关的行为都放入一个对象中，由于所有与状态相关的代码都存在于某个ConcreteState中，
 *      所以通过定义新的子类可以很容易地增加新的状态和转换
 * 3.消除庞大的条件分支语句
 * 4.状态模式通过把各种状态转移逻辑分布到State的子类之间，来减少相互间的依赖
 * 5.当一个对象的行为取决于它的状态，并且它必须在运行时刻根据状态改变它的行为时，就可以考虑使用状态模式了
 **/
public class StateMain {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();

//        work.setFinish(true);
        work.setFinish(false);
        work.setHour(19);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();
    }
}
