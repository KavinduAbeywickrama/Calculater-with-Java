package com.company.Version5.input;

public class CommandLineInput implements Input {

    public String getOperator(String[] args) throws InputException{
        if(args == null || args.length == 0){
            throw new InputException("There must be atleast one CommandLine Argument");
        }

        return args[0];
    }
}
