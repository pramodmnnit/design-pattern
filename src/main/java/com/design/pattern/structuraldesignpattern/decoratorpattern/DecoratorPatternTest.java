package com.design.pattern.structuraldesignpattern.decoratorpattern;

public class DecoratorPatternTest {

  public static void main(String[] args) {
    Car sportsCar = new SportsCar(new BasicCar());
    sportsCar.assemble();
    System.out.println("\n*****");
    Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
    sportsLuxuryCar.assemble();
    System.out.println("\n*****");
    Car luxuryCar = new LuxuryCar(new BasicCar());
    luxuryCar.assemble();
  }

}