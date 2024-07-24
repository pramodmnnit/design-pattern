package com.design.pattern.structuraldesignpattern.adapterpattern;

public class MachineLearningDataParser implements CSVParser {

  @Override
  public void parseCSV() {
    System.out.println("Machine learning CSV parser");
  }
}
