package com.company;

public class SecondClass implements I_Class{
    public boolean match (int number1, int number2){
        int c;
        if (number1>number2){
            c = number1;}
        else{
            c = number2;}
        for (int i = 2; i < c; ++i) {
            if (number1%i==0 && number2%i==0){
                return false;
            }
        }
        return true;
    }
}
