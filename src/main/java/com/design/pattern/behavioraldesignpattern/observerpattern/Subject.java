package com.design.pattern.behavioraldesignpattern.observerpattern;

public interface Subject {

  void addObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyAllObservers();
}
