package com.company.Version2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository {
    public int[] read() throws IOException {
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
        return intNumbers;
    }
}
