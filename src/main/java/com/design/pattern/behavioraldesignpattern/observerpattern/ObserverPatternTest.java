package com.design.pattern.behavioraldesignpattern.observerpattern;

/**
 * Observer design pattern is useful when you are interested in the state of an object and want to
 * get notified whenever there is any change. In observer pattern, the object that watch on the
 * state of another object are called Observer and the object that is being watched is called
 * Subject.
 */
public class ObserverPatternTest {

  public static void main(String[] args) {
    WeatherStationSubjectImpl station = new WeatherStationSubjectImpl();
    new WeatherObserver(station);
    station.setHumidity(10);
    station.setTemperature(89);
    station.setPressure(100);
  }
}
