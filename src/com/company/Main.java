package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("task 3");
        for (int i = 0; i < 17; i++) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("task 5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println("task 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("task 7");
        for (int i = 2; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("task 8");
        int deposit = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("task 9");
        total = 0;
        double percent = 1D/100;
        for (int month = 1; month <= 12; month++) {
            total = total + deposit;
            total = (int) (total * (1 + percent));
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("task 10");
        for (int multiplier = 1; multiplier <=10; multiplier++){
            System.out.printf("%d x %d = %d%n", 2, multiplier, 2 * multiplier);
        }

    }
}
