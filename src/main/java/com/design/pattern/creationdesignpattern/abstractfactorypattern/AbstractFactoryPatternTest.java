package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public class AbstractFactoryPatternTest {

  public static void main(String[] args){

    Computer pc = ComputerFactory.getComputer(new PCFactory("256 GB", "16", "16 Ram"));
    Computer server = ComputerFactory.getComputer(new ServerFactory("512 GB", "32", "32 Ram"));

    System.out.println("Abstract Factory PC config:" + pc);
    System.out.println("Abstract Factory Server config:" + server);

  }
}
