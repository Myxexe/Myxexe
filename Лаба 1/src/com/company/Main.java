package com.company;
import java.util.Scanner;
public class Main {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Input N: ");
            int N = in.nextInt();
            for (int i = 1; i <= 2048; i++) {
                if ((i*N+2) % 7 == 0 &&  (i*N+2)<=2048) {
                    System.out.println(i*N+2);
                }
            }
        }
    }
