package com.nhnacademy.edu.springframework.project.repository;

import java.util.List;

public interface DataParser {

    List<CsvData> parse(String filePath);
}
