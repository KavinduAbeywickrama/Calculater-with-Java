package com.company.Version2;

public class AvgOperation implements Operation{
    public double perform(int[] numbers) {
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];

        }
        result = result / numbers.length;
        return result;
    }
}