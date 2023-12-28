package com.design.pattern.structuraldesignpattern.decoratorpattern;

public class SportsCar extends CarDecorator {

  public SportsCar(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding features of sports car.");
  }
}
