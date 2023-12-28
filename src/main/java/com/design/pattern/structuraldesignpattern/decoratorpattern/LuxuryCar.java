package com.design.pattern.structuraldesignpattern.decoratorpattern;

public class LuxuryCar extends CarDecorator {

  public LuxuryCar(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding features of luxury car.");
  }
}
