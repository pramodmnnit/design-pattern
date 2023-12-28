package com.design.pattern.creationdesignpattern.factorypattern;

public class Server extends Computer {

  private final String cpu;
  private final String ram;
  private final String hdd;

  public Server(String cpu, String ram, String hdd) {
    this.cpu = cpu;
    this.ram = ram;
    this.hdd = hdd;
  }

  @Override
  public String getCPU() {
    return this.cpu;
  }

  @Override
  public String getRAM() {
    return this.ram;
  }

  @Override
  public String getHDD() {
    return this.hdd;
  }
}
