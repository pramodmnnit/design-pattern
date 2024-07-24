package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public class PetrolCarFactory implements AbstractFactory {

  @Override
  public Car getCar(String type) {
    if ("Toyota".equals(type)) {
      return new PetrolToyota();
    } else if ("Ford".equals(type)) {
      return new PetrolFord();
    } else {
      return null;
    }
  }
}
