package com.company.Version5.numberRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository {
    private String fileName = "E:\\Calculater with Java\\src\\com\\company\\numbers.txt";

    public int[] read() throws NumberRepositoryException {
        //-- read the numbers from the text file
        List<String> lines;
        try {
          lines = Files.readAllLines(Paths.get(fileName));

        }catch (IOException exception){
            throw new NumberRepositoryException("Failed to read the numbers file "+ fileName ,exception );
        }

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
