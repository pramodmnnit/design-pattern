package com.design.pattern.creationdesignpattern.abstractfactorypattern;
public class PCFactory extends ComputerAbstractFactory {

  private final String ram;
  private final String cpu;
  private final String hdd;

  public PCFactory(String hdd, String cpu, String ram){
    this.cpu = cpu;
    this.hdd = hdd;
    this.ram = ram;
  }

  @Override
  public Computer getComputer() {
    return new PC(hdd, cpu, ram);
  }
}
