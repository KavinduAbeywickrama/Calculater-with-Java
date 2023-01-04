package com.company.Version3;


import com.company.Version3.input.CommandLineInput;
import com.company.Version3.input.Input;
import com.company.Version3.numberRepository.FileNumberRepository;
import com.company.Version3.numberRepository.NumberRepository;
import com.company.Version3.operations.AddOperation;
import com.company.Version3.operations.AvgOperation;
import com.company.Version3.operations.Operation;
import com.company.Version3.output.CommandLineOutput;
import com.company.Version3.output.Output;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //-- read the operator using command line arguments
        Input input = new CommandLineInput();
        String operator = input.getOperator(args);

        NumberRepository numberRepository = new FileNumberRepository();
        int[] intNumbers = numberRepository.read();



        //--perform the operation
        double result = 0;
        Operation operation = null;
        if (operator.equals("+")){
            //add all the numbers
            operation = new AddOperation();

        } else if (operator.equals("avg")){
            //calculate the average
            operation = new AvgOperation();
        }

        result = operation.perform(intNumbers);
        //--show output to the user
        Output output = new CommandLineOutput();
        output.show("Result: " + result);


    }
}

