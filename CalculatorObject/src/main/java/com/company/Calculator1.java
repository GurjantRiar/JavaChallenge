package com.company;

import java.util.Scanner;
public class Calculator1 {
    int x=2;
    int y=2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a first Number ");
        int x = scanner.nextInt();
        System.out.println("Enter a Second Number");
        int y = scanner.nextInt();
        int addition = x+y;
        int subtraction = x-y;
        int multiplication =x*y;
        int division =x/y;
        System.out.printf("addition = %d\nsubtraction = %d\nmultiplication = %d\ndivision = %d\n" , addition, subtraction,multiplication,division);
    }

}
