package com.design.pattern.behavioraldesignpattern.strategypattern;
public class PaypalPaymentStrategy implements PaymentStrategy {

  private final String emailId;
  private final String password;

  public PaypalPaymentStrategy(String emailId, String password){
    this.emailId = emailId;
    this.password = password;
  }


  @Override
  public void pay(int amount) {
    System.out.println("Paying " + amount + " through paypal");
  }
}
