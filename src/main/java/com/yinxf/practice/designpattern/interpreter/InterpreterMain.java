package com.yinxf.practice.designpattern.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yinxf
 * @Date 2019/11/11
 * @Description 解析器模式
 *
 * 解释器模式：给定一个语言，并定义一个解析器，解释器使用该表示来解释语言中的句子。
 *
 * 1.当有一个语言需要解释执行，并且你可将该语言中的句子表示为一个抽象语法树时，可使用解释器模式。
 * 2.好处：容易的改变和扩展文法，因为该模式使用类来表示文法规则，你可使用继承来改变或扩展该文法，也比较容易实现文法，
 *      因为定义抽象语法树中各个节点的类的实现大体类似，这些类都易于直接编写。
 * 3.不足：解释器模式为文法中的每一条规则至少定义了一个类，因此包含许多规则的文法可能难以管理和维护，建议当文法相当复杂时，
 *      使用其他的技术如语法分析程序或编译器生成器来处理。
 **/
public class InterpreterMain {

    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : list) {
            abstractExpression.interpret(context);
        }

        System.out.println("执行结束。。");
    }
}
