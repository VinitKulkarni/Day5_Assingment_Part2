package com.bridgelabz.Day5P2;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter wind speed value:");
        double v = sc.nextDouble();
        System.out.print("enter temperature value:");
        double t = sc.nextDouble();

        if(t < 50 && v < 120 && v > 3) {
            double data1 = (0.6215 * t);
            double data2 = (0.4275 * t);
            double data3 = Math.pow(v, 0.16);

            double windSpeed = 35.74 + data1 + (data2 - 35.75) * data3;
            System.out.println("windSpeed = " + windSpeed);
        }else{
            System.out.println("inputs are not in range to calculate");
        }
    }
}
