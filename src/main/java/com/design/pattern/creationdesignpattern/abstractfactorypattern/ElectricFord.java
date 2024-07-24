package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public class ElectricFord implements Car {

  @Override
  public void assemble() {
    System.out.println("Assembling an electric Ford car");
  }
}
