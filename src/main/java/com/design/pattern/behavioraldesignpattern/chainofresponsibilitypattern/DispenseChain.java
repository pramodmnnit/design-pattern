package com.design.pattern.behavioraldesignpattern.chainofresponsibilitypattern;

public interface DispenseChain {

  void setNextChain(DispenseChain chain);

  void dispense(Currency currency);
}
