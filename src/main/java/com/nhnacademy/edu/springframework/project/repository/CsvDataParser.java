package com.nhnacademy.edu.springframework.project.repository;

import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvDataParser implements DataParser{

    @Override
    public List<CsvData> parse(String filePath) {
        try (InputStream inputStream = new ClassPathResource(filePath).getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        ) {
            String line = "";
            List<CsvData> dataList = new ArrayList<>();
            while ((line=reader.readLine()) != null) {
                String[] array = line.split(",");
                int seq = Integer.parseInt(array[0]);

                CsvData csvData = new CsvData(Integer.parseInt(array[0]),
                            array[1],array[2],
                            Integer.parseInt(array[3]),
                            Integer.parseInt(array[4]),
                            Integer.parseInt(array[5]),
                            Integer.parseInt(array[6]),0);
                dataList.add(csvData);
            }
            return dataList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
