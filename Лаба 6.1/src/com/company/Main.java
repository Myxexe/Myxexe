package com.company;
import java.util.Scanner;


public class Main {
    private static AbstractNode generateFirst() {
        return new MultNode(
                new AddNode(new SimpleNode(5), new SimpleNode(5)),
                new AddNode(new SimpleNode(3), new SimpleNode(1)));
    }
    private static AbstractNode generateSecond() {
        return new MultNode(
                new AddNode(new SimpleNode(5), new SimpleNode(3)),
                new AddNode(new SimpleNode(3), new SimpleNode(1)));
    }
    public static void main(String[] args) {
        AbstractNode first = generateFirst();
        AbstractNode second = generateSecond();
        System.out.println("The first expression is: \n" + first.toString()
                + "\nValue is: " + first.calculate());
        System.out.println("The second expression is: \n" + second.toString()
                + "\nValue is: " + second.calculate());
    }
}
