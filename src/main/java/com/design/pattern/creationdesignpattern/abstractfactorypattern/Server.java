package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public class Server extends Computer {

  private final String hdd;
  private final String cpu;
  private final String ram;

  public Server(String hdd, String cpu, String ram) {
    this.hdd = hdd;
    this.cpu = cpu;
    this.ram = ram;
  }


  @Override
  public String getRAM() {
    return ram;
  }

  @Override
  public String getHDD() {
    return hdd;
  }

  @Override
  public String getCPU() {
    return cpu;
  }
}
