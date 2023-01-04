package com.company.Version3.input;

public class CommandLineInput implements Input {
    public String getOperator(String[] args){
        return args[0];
    }
}
