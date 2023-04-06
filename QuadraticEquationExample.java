package com.bridgelabz.Day5P2;

public class QuadraticEquationExample {
    public static void main(String[] args) {
        int a = 1, b = 5, c = 2;
        //int a = 1, b = 1, c = 1;
        double delta = b*b - 4*a*c;
        //double bcz Math.squrt(doubleValue);

        //delta > 0 (calculate two roots + and -)
        //delta == 0 ()
        //delta < 0 (roots are not real: No calculation)

        //Root 1 of x = (-b + sqrt(delta))/(2*a)
        //Root 2 of x = (-b - sqrt(delta))/(2*a)

        double root1 = 0;
        double root2 = 0;

        System.out.println("delta = " +delta);
        if(delta > 0){
            root1 = (-b + Math.sqrt(delta))/(2*a);
            root2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("Roots are --> " +root1+ " and " +root2);
        } else if (delta == 0) {
            root1 = -b / (2.0 * a);
            System.out.println("The root is " + root1);
        }else{
            System.out.println("Roots are not real/imaginary");
        }
    }
}
