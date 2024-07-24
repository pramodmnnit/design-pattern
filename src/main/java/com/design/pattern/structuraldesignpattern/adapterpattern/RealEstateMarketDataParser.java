package com.design.pattern.structuraldesignpattern.adapterpattern;

public class RealEstateMarketDataParser implements CSVParser {

  @Override
  public void parseCSV() {
    System.out.println("Real estate market data CSV parser");
  }
}
