package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public class FactoryProvider {

  public static AbstractFactory getFactory(String factory) {
    if ("Electric".equals(factory)) {
      return new ElectricCarFactory();
    } else if ("Petrol".equals(factory)) {
      return new PetrolCarFactory();
    } else {
      return null;
    }
  }
}
