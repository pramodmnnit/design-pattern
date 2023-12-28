package com.design.pattern.behavioraldesignpattern.visitorpattern;

public class Fruit implements ItemElement{

  private final Integer pricePerKg;
  private final Integer weight;
  private final String name;


  public Fruit(Integer pricePerKg, Integer weight, String name) {
    this.pricePerKg = pricePerKg;
    this.weight = weight;
    this.name = name;
  }

  public Integer getPricePerKg() {
    return pricePerKg;
  }

  public Integer getWeight() {
    return weight;
  }

  public String getName() {
    return name;
  }

  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
