package com.company.Version5.operations;

public class OperationFactory {
    public Operation getInstance(String operator){
        double result = 0;
        Operation operation = null;
        if (operator.equals("+")){
            //add all the numbers
            operation = new AddOperation();

        } else if (operator.equals("avg")){
            //calculate the average
            operation = new AvgOperation();
        }else if(operator.equals("max")){
            operation = new MaxOperation();
        }
        return operation;
    }
}

