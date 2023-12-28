package com.design.pattern.behavioraldesignpattern.observerpattern;

public interface Observer {

  void update();
  void setSubject(Subject subject);

  String getName();

}
