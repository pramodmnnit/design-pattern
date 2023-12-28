package com.design.pattern.behavioraldesignpattern.observerpattern;

import java.util.Objects;

public class MyTopicObserver implements Observer {

  private final String name;
  private Subject subject;

  public MyTopicObserver(String name){
    this.name = name;
  }

  @Override
  public String getName(){
    return name;
  }

  @Override
  public void update() {
    String message = (String) this.subject.getUpdate();
    if(Objects.isNull(message)){
      System.out.println("No new message");
    } else {
      System.out.println("Name:" + this.name + " is consuming the message:" + message);
    }
  }

  @Override
  public void setSubject(Subject subject) {
     this.subject = subject;
  }
}
