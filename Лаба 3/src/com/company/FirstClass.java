package com.company;

public class FirstClass implements I_Class{
    public boolean match (int number1, int number2)
    {
        boolean m = (number1 > number2);
        if (m)
            return true;
        else
            return false;
        }
    }