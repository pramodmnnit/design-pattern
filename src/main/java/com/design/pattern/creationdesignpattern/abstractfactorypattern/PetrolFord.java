package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public class PetrolFord implements Car {

  @Override
  public void assemble() {
    System.out.println("Assembling a petrol Ford car");
  }
}
