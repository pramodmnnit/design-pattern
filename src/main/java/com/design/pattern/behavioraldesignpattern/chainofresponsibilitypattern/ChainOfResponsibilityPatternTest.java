package com.design.pattern.behavioraldesignpattern.chainofresponsibilitypattern;


import java.util.Scanner;

public class ChainOfResponsibilityPatternTest {

  private final DispenseChain chain;
  public ChainOfResponsibilityPatternTest() {
    Dollar50Dispenser firstChain = new Dollar50Dispenser();
    Dollar20Dispenser secondChain = new Dollar20Dispenser();
    Dollar10Dispenser thirdChain = new Dollar10Dispenser();
    firstChain.setNextChain(secondChain);
    secondChain.setNextChain(thirdChain);
    this.chain = firstChain;
  }

  public static void main(String [] args){
    ChainOfResponsibilityPatternTest responsibilityPatternTest = new ChainOfResponsibilityPatternTest();
    while (true) {
      int amount;
      System.out.println("Enter amount to dispense");
      Scanner input = new Scanner(System.in);
      amount = input.nextInt();
      if (amount % 10 != 0) {
        System.out.println("Amount should be in multiple of 10s.");
        return;
      }
      responsibilityPatternTest.chain.dispense(new Currency(amount));
    }
  }
}
