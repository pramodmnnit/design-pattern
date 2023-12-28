package com.design.pattern.behavioraldesignpattern.chainofresponsibilitypattern;

public class Dollar50Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain chain) {
    this.chain = chain;
  }

  @Override
  public void dispense(Currency currency) {
    if(currency.getAmount() <= 0){
      return;
    }
    if(currency.getAmount() >= 50){
      int remainder = currency.getAmount() % 50;
      System.out.println("Dispensing " + currency.getAmount() / 50 + " 50$ notes");
      if(remainder != 0){
        this.chain.dispense(new Currency(remainder));
      }
    } else {
      this.chain.dispense(currency);
    }

  }
}
