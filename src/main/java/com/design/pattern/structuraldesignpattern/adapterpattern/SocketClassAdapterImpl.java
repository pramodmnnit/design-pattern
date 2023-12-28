package com.design.pattern.structuraldesignpattern.adapterpattern;
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {


  @Override
  public Volt get3Volts() {
    return convertVolts(40);
  }

  @Override
  public Volt get12Volts() {
    return convertVolts(10);
  }

  @Override
  public Volt get120Volts() {
    return getVolt();
  }

  private Volt convertVolts(int value){
    return new Volt(getVolt().getVolts() / value);
  }
}
