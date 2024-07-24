package com.design.pattern.behavioraldesignpattern.observerpattern;

public class WeatherObserver implements Observer {

  private final Subject subject;

  public WeatherObserver(Subject subject) {
    this.subject = subject;
    this.subject.addObserver(this);
  }

  @Override
  public void update(int pressure, int temperature, int humidity) {
    System.out.println(
        "Pressure :" + pressure + ", temperature:" + temperature + ", humidity:" + humidity);
  }
}
