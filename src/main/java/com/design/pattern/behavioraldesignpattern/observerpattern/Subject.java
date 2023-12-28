package com.design.pattern.behavioraldesignpattern.observerpattern;

public interface Subject {

  void register(Observer observer);
  void unregister(Observer observer);
  void notifyObservers();
  Object getUpdate();

}
