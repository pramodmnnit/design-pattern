package com.design.pattern.creationdesignpattern.abstractfactorypattern;

public abstract class Computer {
  public abstract String getRAM();
  public abstract String getHDD();
  public abstract String getCPU();

  @Override
  public String toString() {
    return "{" +
        "hdd='" + getHDD() + '\'' +
        ", cpu='" + getCPU() + '\'' +
        ", ram='" + getRAM() + '\'' +
        '}';
  }
}
