package com.design.pattern.structuraldesignpattern.adapterpattern;
public class SocketObjectAdapterImpl implements SocketAdapter {

  Socket socket = new Socket();

  @Override
  public Volt get3Volts() {
    return convertVolt(40);
  }

  @Override
  public Volt get12Volts() {
    return convertVolt(10);
  }

  @Override
  public Volt get120Volts() {
    return convertVolt(1);
  }

  private Volt convertVolt(int value){
    return new Volt(socket.getVolt().getVolts()/ value);
  }
}
