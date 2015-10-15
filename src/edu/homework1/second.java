package edu.homework1;

/**
 * Created by User on 14.10.2015.
 */
public class second {

 public static void main(String[] args) {
    int x1 = 1, y1 = 1;
    int x2 = 10, y2 = 7;
    int x3 = -3, y3 = 4;
    int a = (int) Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
    int b = (int) Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2));
    int c = (int) Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
    int length = a + b + c;


    double square = (double)((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2;


    System.out.println("Length of all sides is " + length);
    System.out.println("Square is " + square);
}}


