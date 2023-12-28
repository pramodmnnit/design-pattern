package com.design.pattern.creationdesignpattern.factorypattern;

public class ComputerFactory {

  public static Computer createComputer(String cpu, String ram, String hdd, String type) {
    if ("PC".equals(type)) {
      return new PC(cpu, ram, hdd);
    } else {
      return new Server(cpu, ram, hdd);
    }
  }
}
