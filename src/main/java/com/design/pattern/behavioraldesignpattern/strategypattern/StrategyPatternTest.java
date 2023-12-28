package com.design.pattern.behavioraldesignpattern.strategypattern;


public class StrategyPatternTest {

  public static void main(String[] args){
    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.addItem(new Item("Item 1", 100));
    shoppingCart.addItem(new Item("Item 2", 300));
    shoppingCart.addItem(new Item("Item 3", 200));
    shoppingCart.addItem(new Item("Item 4", 500));

    PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy("Pramod", "122", "123456", "12-12-2026");
    shoppingCart.pay(paymentStrategy);

    paymentStrategy = new PaypalPaymentStrategy("123@gmail.com", "@qweqe");
    shoppingCart.pay(paymentStrategy);
  }
}
