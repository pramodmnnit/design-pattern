package com.design.pattern.behavioraldesignpattern.visitorpattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

  @Override
  public Integer visit(Book book) {
    int cost = 0;
    //apply 5$ discount if book price is greater than 50
    if (book.getPrice() > 50) {
      cost = book.getPrice() - 5;
    } else {
      cost = book.getPrice();
    }
    System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
    return cost;
  }

  @Override
  public Integer visit(Fruit fruit) {
    int cost = fruit.getPricePerKg() * fruit.getWeight();
    System.out.println(fruit.getName() + " cost = " + cost);
    return cost;
  }
}
