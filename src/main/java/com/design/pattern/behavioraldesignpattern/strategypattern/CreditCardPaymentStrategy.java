package com.design.pattern.behavioraldesignpattern.strategypattern;
public class CreditCardPaymentStrategy implements PaymentStrategy {

  private final String name;
  private final String cvv;
  private final String cardNumber;
  private final String dateOfExpiry;

  public CreditCardPaymentStrategy(String name, String cvv, String cardNumber,
      String dateOfExpiry) {
    this.name = name;
    this.cvv = cvv;
    this.cardNumber = cardNumber;
    this.dateOfExpiry = dateOfExpiry;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paying " + amount + " through credit card");
  }
}
