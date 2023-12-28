package com.design.pattern.behavioraldesignpattern.visitorpattern;

public class Book implements ItemElement {

  private final Integer price;
  private final String isbnNumber;

  public Book(Integer price, String name) {
    this.price = price;
    this.isbnNumber = name;
  }

  public Integer getPrice() {
    return price;
  }

  public String getIsbnNumber() {
    return isbnNumber;
  }

  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
