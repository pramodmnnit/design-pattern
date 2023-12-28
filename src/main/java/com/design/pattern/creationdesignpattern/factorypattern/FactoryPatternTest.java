package com.design.pattern.creationdesignpattern.factorypattern;

public class FactoryPatternTest {

  public static void main(String[] args) {
    Computer pc = ComputerFactory.createComputer("8", "16 GB", "256 GB", "PC");
    Computer server = ComputerFactory.createComputer("8", "16 GB", "256 GB", "Server");
    System.out.println("PC config:" + pc);
    System.out.println("Server config:" + server);
  }

}
