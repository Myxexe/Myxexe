package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        task3(x1,y1,x2,y2);
    }
    public static void task3(int x1, int y1, int x2, int y2){
        int n1 = nod(x1, y1);
        int n2 = nod(x2, y2);
        if (n1 < n2){
            System.out.println("(" + Integer.toString(x1) + "," + Integer.toString(y1) + ")" + " - " + Integer.toString(n1));
            System.out.println("(" + Integer.toString(x2) + "," + Integer.toString(y2) + ")" + " - " + Integer.toString(n2));
        }
        else if (n2 < n1){
            System.out.println("(" + Integer.toString(x2) + "," + Integer.toString(y2) + ")" + " - " + Integer.toString(n2));
            System.out.println("(" + Integer.toString(x1) + "," + Integer.toString(y1) + ")" + " - " + Integer.toString(n1));
        }
        else{
            if (x1 == x2) {
                if (y1 < y2){
                    System.out.println("(" + Integer.toString(x1) + "," + Integer.toString(y1) + ")" + " - " + Integer.toString(n1));
                    System.out.println("(" + Integer.toString(x2) + "," + Integer.toString(y2) + ")" + " - " + Integer.toString(n2));
                }
                else{
                    System.out.println("(" + Integer.toString(x2) + "," + Integer.toString(y2) + ")" + " - " + Integer.toString(n2));
                    System.out.println("(" + Integer.toString(x1) + "," + Integer.toString(y1) + ")" + " -" + Integer.toString(n1));
                }
            }
            else if (x1 < x2) {
                System.out.println("(" + Integer.toString(x1) + "," + Integer.toString(y1) + ")" + " - " + Integer.toString(n1));
                System.out.println("(" + Integer.toString(x2) + "," + Integer.toString(y2) + ")" + " - " + Integer.toString(n2));
            }
            else{
                System.out.println("(" + Integer.toString(x2) + "," + Integer.toString(y2) + ")" + " - " + Integer.toString(n2));
                System.out.println("(" + Integer.toString(x1) + "," + Integer.toString(y1) + ")" + " - " + Integer.toString(n1));
            }
        }
    }
    public static int nod(int x, int y){
        int min = 0;
        if (x > y){
            min = y;
        }
        else{
            min = x;
        }
        int n = 0;
        for (int i = 1; i<=min; i++){
            if ((x%i == 0) && (y%i == 0)){
                n = i;
            }
        }
        return n;
    }
}
