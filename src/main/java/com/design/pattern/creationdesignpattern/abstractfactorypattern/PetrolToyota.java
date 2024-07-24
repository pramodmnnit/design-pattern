package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public class PetrolToyota implements Car {

  @Override
  public void assemble() {
    System.out.println("Assembling a petrol Toyota car");
  }
}
