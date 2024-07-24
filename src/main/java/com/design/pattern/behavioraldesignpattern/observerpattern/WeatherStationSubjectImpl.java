package com.design.pattern.behavioraldesignpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationSubjectImpl implements Subject {
  private final List<Observer> observerList;
  private int pressure;
  private int temperature;
  private int humidity;

  public WeatherStationSubjectImpl() {
    this.observerList = new ArrayList<>();
  }

  @Override
  public void addObserver(Observer observer) {
    this.observerList.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    this.observerList.remove(observer);
  }

  @Override
  public void notifyAllObservers() {
    this.observerList.forEach(each -> each.update(pressure, temperature, humidity));
  }

  public void setPressure(int pressure) {
    this.pressure = pressure;
    notifyAllObservers();
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    notifyAllObservers();
  }

  public void setHumidity(int humidity) {
    this.humidity = humidity;
    notifyAllObservers();
  }
}
