package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public class ComputerFactory {

  public static Computer getComputer(ComputerAbstractFactory factory){
    return factory.getComputer();
  }
}
