package com.design.pattern.structuraldesignpattern.compositepattern;

public class Leaf implements Component {

  private final String name;
  private final Long size;

  public Leaf(String name, Long size) {
    this.name = name;
    this.size = size;
  }

  @Override
  public void displayInfo() {
    System.out.println("File:" + name);
  }

  @Override
  public Long getSize() {
    return size;
  }
}
