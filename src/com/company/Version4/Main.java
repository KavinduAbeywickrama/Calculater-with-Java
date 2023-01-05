package com.company.Version4;


import com.company.Version4.input.CommandLineInput;
import com.company.Version4.input.Input;
import com.company.Version4.numberRepository.FileNumberRepository;
import com.company.Version4.numberRepository.NumberRepository;
import com.company.Version4.operations.AddOperation;
import com.company.Version4.operations.AvgOperation;
import com.company.Version4.operations.Operation;
import com.company.Version4.operations.OperationFactory;
import com.company.Version4.output.CommandLineOutput;
import com.company.Version4.output.Output;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //-- read the operator using command line arguments
        Input input = new CommandLineInput();
        String operator = input.getOperator(args);
        NumberRepository numberRepository = new FileNumberRepository();
        int[] intNumbers = numberRepository.read();

        //Using the factory design pattern to create the operation object
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);

        //--perform the operation
        double result = operation.perform(intNumbers);
        //--show output to the user
        Output output = new CommandLineOutput();
        output.show("Result: " + result);


    }
}

