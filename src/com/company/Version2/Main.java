package com.company.Version2;


import com.company.Version2.operations.AddOperation;
import com.company.Version2.operations.AvgOperation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //-- read the operator using command line arguments
        CommandLineInput commandLineInput = new CommandLineInput();
        String operator = commandLineInput.getOperator(args);

        FileNumberRepository numberRepository = new FileNumberRepository();
        int[] intNumbers = numberRepository.read();



        //--perform the operation
        double result = 0;
        if (operator.equals("+")){
            //add all the numbers
            AddOperation addOperation = new AddOperation();
            result = addOperation.perform(intNumbers);

        } else if (operator.equals("avg")){
            //calculate the average
            AvgOperation avgOperation = new AvgOperation();
            result = avgOperation.perform(intNumbers);
        }


        //--show output to the user
        CommandLineOutput commandLineOutput = new CommandLineOutput();
        commandLineOutput.show("Result: " + result);


    }
}

