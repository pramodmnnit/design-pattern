package com.design.pattern.behavioraldesignpattern.iteratorpattern;

public class Channel {
  private final double frequency;
  private final ChannelTypeEnum type;

  public Channel(double frequency, ChannelTypeEnum type) {
    this.frequency = frequency;
    this.type = type;
  }

  public double getFrequency(){
    return  frequency;
  }

  public ChannelTypeEnum getType(){
    return type;
  }

  @Override
  public String toString(){
    return "Frequency="+this.frequency+", Type="+this.type;
  }
}
