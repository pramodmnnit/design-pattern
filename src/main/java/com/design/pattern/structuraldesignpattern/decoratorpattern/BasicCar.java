package com.design.pattern.structuraldesignpattern.decoratorpattern;

public class BasicCar implements Car {

  @Override
  public void assemble() {
    System.out.println("Basic car.");
  }
}
