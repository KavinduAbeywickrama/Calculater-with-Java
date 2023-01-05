package com.company.Version5.numberRepository;

import java.io.IOException;

public class NumberRepositoryException extends Exception{
    public NumberRepositoryException(String s, Exception exception) {
        super(s,exception);
    }
}
