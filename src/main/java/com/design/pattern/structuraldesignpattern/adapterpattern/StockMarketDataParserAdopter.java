package com.design.pattern.structuraldesignpattern.adapterpattern;

public class StockMarketDataParserAdopter implements CSVParser {

  private final StockMarketDataParser stockMarketDataParser;

  public StockMarketDataParserAdopter(StockMarketDataParser stockMarketDataParser) {
    this.stockMarketDataParser = stockMarketDataParser;
  }

  @Override
  public void parseCSV() {
    this.stockMarketDataParser.parseXML();
  }
}
