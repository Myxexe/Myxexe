package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        Segment otrezok1 = new Segment ();
        System.out.println ("Enter p1 x: ");
        Scanner in = new Scanner (System.in);
        p1.x = in.nextInt();
        System.out.println ("Enter p1 y: ");
        p1.y = in.nextInt();
        System.out.println ("Enter p1 z: ");
        p1.z = in.nextInt();
        System.out.println ("Enter p2 x: ");
        p2.x = in.nextInt();
        System.out.println ("Enter p2 y: ");
        p2.y = in.nextInt();
        System.out.println ("Enter p2 z: ");
        p2.z = in.nextInt();
        otrezok1.p1 = p1;
        otrezok1.p2 = p2;
        otrezok1.lengthcalculator(otrezok1.p1, otrezok1.p2, otrezok1.Length);
        System.out.println("lenght: " + otrezok1.Length);
    }
}
