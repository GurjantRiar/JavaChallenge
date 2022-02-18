package com.company;

public class Calculator1 {
    public int addition(int x, int y) {
        return x+y;
    }
    public double addition(double x, double y) {
        return x+y;
    }
    public int subtraction(int x, int y) {
        return x-y;
    }
    public double subtraction(double x, double y) {
        return x-y;
    }
    public int multiplication(int x, int y) {
        return x*y;
    }
    public double multiplication(double x, double y) {
        return x*y;
    }
    public int division(int x, int y) {
        return x/y;

    }
    public double division(double x, double y) {
        return x/y;
    }
    public static void main(String[] args) {

        Calculator1 calc = new Calculator1();

        System.out.println("Adding two ints(1+1): "+calc.addition(1, 1));

        System.out.println("Substracting two ints(23-52): "+calc.subtraction(23, 52));

        System.out.println("Multiplying two ints(34*2): "+calc.multiplication(34, 2));

        System.out.println("Dividing two ints(12/3): "+calc.division(12, 3));

        System.out.println("Dividing two ints(12/7): "+calc.division(12, 7));

        System.out.println("Adding two doubles(3.4+2.3): "+calc.addition(3.4, 2.3));

        System.out.println("Multiplying two doubles(6.7*4.4): "+calc.multiplication(6.7, 4.4));

        System.out.println("Substracting two doubles(5.5-0.5): "+calc.subtraction(5.5, 0.5));

        System.out.println("Dividing two doubles(10.8/2/2): "+calc.division(10.8, 2.2));

    }

}
