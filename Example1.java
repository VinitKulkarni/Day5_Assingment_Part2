package com.bridgelabz.Day5P2;

import java.io.PrintWriter;
import java.util.Scanner;


//2d array + Printwriter stream class
public class Example1 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("enter m value = ");
        int rowsM = sc.nextInt();
        System.out.print("enter n value = ");
        int colsN = sc.nextInt();
        int arrayData[][] = new int[rowsM][colsN];


        for(int i=0; i<rowsM; i++){
            for(int j=0; j<colsN; j++){
                System.out.print("enter elements = ");
                int data = sc.nextInt();
                arrayData[i][j] = data;
            }
        }

        PrintWriter outputWindow = new PrintWriter(System.out);
        //PrintWriter fileOutputW = new PrintWriter("outputfile.txt");




        for(int i=0; i<rowsM; i++){
            for(int j=0; j<colsN; j++){
                //System.out.print(arrayData[i][j] + " ");
                outputWindow.print(arrayData[i][j] + " ");
                //fileOutputW.print(arrayData[i][j] + " ");
            }
            //System.out.println();
            outputWindow.println("");
            //fileOutputW.println("");
        }
        outputWindow.flush();//empty the content
        outputWindow.close();//closes write stream and free the memory
        //fileOutputW.flush();
        //fileOutputW.close();
    }
}
