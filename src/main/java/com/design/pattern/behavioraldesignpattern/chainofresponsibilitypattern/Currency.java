package com.design.pattern.behavioraldesignpattern.chainofresponsibilitypattern;

public class Currency {

  private final Integer amount;

  public Currency(int amount){
    this.amount = amount;
  }
  public int getAmount(){
    return amount;
  }
}
