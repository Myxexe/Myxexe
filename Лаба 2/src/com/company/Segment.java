package com.company;

public class Segment {
    public Point p1;
    public Point p2;
    public double Length;
    public void lengthcalculator (Point p1, Point p2, double l)
    {
        l= Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y)+(p2.z-p1.z)*(p2.z-p1.z));
                Length = l;
    }
}
