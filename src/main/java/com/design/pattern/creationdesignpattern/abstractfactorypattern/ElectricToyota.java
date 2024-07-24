package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public class ElectricToyota implements Car {

  @Override
  public void assemble() {
    System.out.println("Assembling an electric Toyota car");
  }
}
