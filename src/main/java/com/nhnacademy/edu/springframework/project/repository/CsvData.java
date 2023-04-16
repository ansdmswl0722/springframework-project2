package com.nhnacademy.edu.springframework.project.repository;

public class CsvData {

    private final int seq;
    private final String city;
    private final String sector;
    private final int level;
    private final int unitStart;
    private final int unitEnd;
    private final int unitPrice;
    private final int levelPrice;

    public CsvData(int seq, String city, String sector, int level, int unitStart, int unitEnd, int unitPrice, int levelPrice) {
        this.seq = seq;
        this.city = city;
        this.sector = sector;
        this.level = level;
        this.unitStart = unitStart;
        this.unitEnd = unitEnd;
        this.unitPrice = unitPrice;
        this.levelPrice = levelPrice;
    }

    public int getSeq() {
        return seq;
    }

    public String getCity() {
        return city;
    }

    public String getSector() {
        return sector;
    }

    public int getLevel() {
        return level;
    }

    public int getUnitStart() {
        return unitStart;
    }

    public int getUnitEnd() {
        return unitEnd;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getLevelPrice() {
        return levelPrice;
    }
}
