package com.bridgelabz.Day5P2;

public class SumOfInteger {
    public static void main(String[] args) {
        int arrayData[] = {1,1,-2,-1,0,-2,5,-5};
        boolean flag = false;

        for(int i=0; i<arrayData.length-2; i++){
            for(int j=i+1; j<arrayData.length-1; j++){
                for(int k=j+1; k<arrayData.length; k++){
                    if(arrayData[i] + arrayData[j] + arrayData[k] == 0){
                        System.out.println(arrayData[i] +"+"+ arrayData[j] +"+"+ arrayData[k] +"== 0");
                        flag = true;
                    }
                }
            }
        }
        if(flag = false)
            System.out.println("Combination not exists");
    }
}
