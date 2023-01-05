package com.company.Version5;


import com.company.Version5.input.CommandLineInput;
import com.company.Version5.input.Input;
import com.company.Version5.input.InputException;
import com.company.Version5.numberRepository.FileNumberRepository;
import com.company.Version5.numberRepository.NumberRepository;
import com.company.Version5.numberRepository.NumberRepositoryException;
import com.company.Version5.operations.Operation;
import com.company.Version5.operations.OperationFactory;
import com.company.Version5.output.CommandLineOutput;
import com.company.Version5.output.Output;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException {
        //-- read the operator using command line arguments
        Input input = new CommandLineInput();
        String operator = null;
        try {
            operator = input.getOperator(args);
        } catch (InputException e) {
            //Log the exception
            //Logger.error ("Exception occured while reading the operator");
        }
        NumberRepository numberRepository = new FileNumberRepository();
        int[] intNumbers = null;
        try {
            intNumbers = numberRepository.read();

        }catch (NumberRepositoryException exception){
            // log that exception into a file using support of a library

            return;
        }




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

