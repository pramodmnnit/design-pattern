package com.design.pattern.structuraldesignpattern.adapterpattern;

/**
 * Adapter design pattern is one of the structural design pattern and its used so that two unrelated
 * interfaces can work together. The object that joins these unrelated interface is called an
 * Adapter.
 */
public class AdapterPatternTest {

  public static void main(String[] args) {
    CSVParser realEstateMarketDataParser = new RealEstateMarketDataParser();
    CSVParser machineLearningDataParser = new MachineLearningDataParser();
    CSVParser stockMarketDataParser = new StockMarketDataParserAdopter(new StockMarketDataParser());
    realEstateMarketDataParser.parseCSV();
    machineLearningDataParser.parseCSV();
    stockMarketDataParser.parseCSV();
  }
}
