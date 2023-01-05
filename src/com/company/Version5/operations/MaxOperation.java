package com.company.Version5.operations;

public class MaxOperation implements Operation {
    public double perform(int[] numbers){
        //calculate the maximum number of numbers array
        double result = 0;
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]>result){
                result = numbers[i];
            }
        }return result;
    }

}