package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public class ElectricCarFactory implements AbstractFactory {

  @Override
  public Car getCar(String type) {
    if ("Toyota".equals(type)) {
      return new ElectricToyota();
    } else if ("Ford".equals(type)) {
      return new ElectricFord();
    } else {
      return null;
    }
  }
}
