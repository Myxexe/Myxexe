package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FirstClass F_Class = new FirstClass();
        SecondClass S_Class= new SecondClass();
        Scanner in = new Scanner(System.in);
        System.out.println("Number1: ");
        int number1 = in.nextInt();
        System.out.println("Number2: ");
        int number2 = in.nextInt();
        System.out.println("FirstClass: " + F_Class.match(number1, number2));
        System.out.println("SecondClass: " + S_Class.match(number1, number2));
    }
}
