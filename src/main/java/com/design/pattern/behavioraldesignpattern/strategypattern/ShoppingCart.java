package com.design.pattern.behavioraldesignpattern.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  private final List<Item> items;

  public ShoppingCart(){
    items =  new ArrayList<>();
  }

  public void addItem(Item item){
    items.add(item);
  }

  public int calculateTotalPrice(){
    int price = 0;
    for (Item each : items){
      price+= each.getPrice();
    }
    return price;
  }

  public void pay(PaymentStrategy paymentStrategy){
    int totalPrice =  calculateTotalPrice();
    paymentStrategy.pay(totalPrice);
  }
}
