package com.epam.tr.start;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int first = enterFromConsole();
        int second = enterFromConsole();
//        System.out.println(sum(first, second));
//        System.out.println(maxInt(first, second));
        print(sum(first, second), maxInt(first, second));
    }

    public static int enterFromConsole() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter>");
        return scn.nextInt();
    }

    public static int sum(int put, int pat) {
        int summa = put + pat;
        return summa;
    }

    public static int maxInt(int put, int pat) {
        int max = 0;
        if (put > pat) {
            max = put;
        } else {
            max = pat;
        }
        return max;
    }

    public static void print(int a, int b) {
        System.out.println(" " + a + " " + b);
    }
}
