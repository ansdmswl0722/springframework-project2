package com.nhnacademy.edu.springframework.project.service;

import com.nhnacademy.edu.springframework.project.repository.CsvData;
import com.nhnacademy.edu.springframework.project.repository.DefaultPriceListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("waterBillService")
public class DefaultWaterBillService implements WaterBillService{
    DefaultPriceListRepository repository;

    @Autowired
    public DefaultWaterBillService(DefaultPriceListRepository repository) {
        this.repository = repository;
    }

    @Override
    public int calculateService(int usage) {
        List<CsvData> csvDataList = repository.getUsageWaterBill(usage);
        return 0;
    }
}
