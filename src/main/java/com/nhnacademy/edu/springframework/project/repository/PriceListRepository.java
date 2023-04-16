package com.nhnacademy.edu.springframework.project.repository;

import java.util.List;

public interface PriceListRepository {

    void csvLoad(String filePath);

    List<CsvData> getUsageWaterBill(int usage);
}
