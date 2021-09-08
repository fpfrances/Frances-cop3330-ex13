/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
import java.lang.Math;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What is the principal amount? ");
        int p = sc.nextInt();
        System.out.printf("What is the rate? ");
        float r = sc.nextFloat();
        System.out.printf("What is the number of years? ");
        int t = sc.nextInt();
        System.out.printf("What is the number of times the interest is compounded per year? ");
        int n = sc.nextInt();
        double a = (double) p * Math.pow(1+((r*0.01)/n), n*t);
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",p, r, t, n, a);
    }
}