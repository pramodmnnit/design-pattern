package com.design.pattern.structuraldesignpattern.adapterpattern;
public class Socket {

  public Volt getVolt(){
    return new Volt(120);
  }
}
