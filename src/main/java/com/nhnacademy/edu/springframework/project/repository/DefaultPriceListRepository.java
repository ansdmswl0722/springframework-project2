package com.nhnacademy.edu.springframework.project.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository("priceListRepository")
public class DefaultPriceListRepository implements PriceListRepository{

    private List<CsvData> csvDataList;

    @Override
    public void csvLoad(String filePath) {
        CsvDataParser csvDataParser = new CsvDataParser();
       csvDataList= csvDataParser.parse(filePath);
    }

    @Override
    public List<CsvData> getUsageWaterBill(int usage) {
        return csvDataList.stream()
                .filter(csvData -> usage>=csvData.getUnitStart() && usage<=csvData.getUnitEnd())
                .collect(Collectors.toList());
    }
}
