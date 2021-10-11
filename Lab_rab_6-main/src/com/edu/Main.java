package com.edu;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        AbstractNode first = new MultNode(
                 new SubNode(new SimpleNode(5), new SimpleNode(5)),
                 new SubNode(new SimpleNode(3), new SimpleNode(1)));

        AbstractNode second = new MultNode(
                new SubNode(new SimpleNode(5), new SimpleNode(3)),
                new SubNode(new SimpleNode(3), new SimpleNode(1)));

        System.out.println("Первое выражение: " + first.toString()
                + "\nValue is: " + first.calculate());
        System.out.println("Второе выражение: " + second.toString()
                + "\nValue is: " + second.calculate());
    }
}