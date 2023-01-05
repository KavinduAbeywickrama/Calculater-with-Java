package com.company.Version4.input;

public class CommandLineInput implements Input {
    public String getOperator(String[] args){
        return args[0];
    }
}
