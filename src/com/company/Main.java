package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static javax.print.attribute.standard.MediaSize.Engineering.D;

public class Main {
    public static void main(String[] args) throws IOException {
        //-- read the operator using command line arguments
        String operator = args[0];
        System.out.println("operator is " + operator);

        //-- read the numbers from the text file
        List<String> lines = Files.readAllLines(Paths.get("D:\\1. SE LECTURES\\2nd Year 1st Sem\\SENG 21222 - Software Construction\\Calculater with Java\\src\\com\\company\\numbers.txt"));

        String firstLine = lines.get(0);

        //split first line by comma
        String[] numbers = firstLine.split(",");

        //convert numbers into integers
        int[] intNumbers = new int[numbers.length];
        for (int i =0;i< numbers.length;i++){
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }

        //--perform the operation
        double result = 0;
        if (operator.equals("+")){
            //add all the numbers
            for(int i=0;i< intNumbers.length;i++){
                result +=intNumbers[i];
            }
        } else if (operator.equals("avg")){
            //calculate the average
            for(int i=0;i< intNumbers.length;i++){
                result +=intNumbers[i];
            }
            result = result / intNumbers.length;
        }


        //--show output to the user
        System.out.println("Result :" + result);


    }
}

