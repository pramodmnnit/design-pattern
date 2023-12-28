package com.design.pattern.creationdesignpattern.abstractfactorypattern;
public class ServerFactory extends ComputerAbstractFactory {

  private final String ram;
  private final String cpu;
  private final String hdd;

  public ServerFactory(String hdd, String cpu, String ram){
    this.cpu = cpu;
    this.hdd = hdd;
    this.ram = ram;
  }

  @Override
  public Computer getComputer() {
    return new Server(hdd, cpu, ram);
  }
}
