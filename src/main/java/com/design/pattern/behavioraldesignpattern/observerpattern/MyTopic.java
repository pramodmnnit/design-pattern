package com.design.pattern.behavioraldesignpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyTopic implements Subject {

  private final Object MUTEX =  new Object();
  private final List<Observer> observers ;
  private String message;
  private Boolean isChanged ;

  public MyTopic(){
    observers = new ArrayList<>();
  }


  @Override
  public void register(Observer observer) {
  if(Objects.isNull(observer)){
    throw new NullPointerException("Observer is not null");
  }

  synchronized (MUTEX){
    if(!observers.contains(observer)){
      System.out.println("Observer name:" + observer.getName() + " is registered");
      observers.add(observer);
    }
  }

  }

  @Override
  public void unregister(Observer observer) {
  synchronized (MUTEX){
    System.out.println("Observer name:" + observer.getName() + " is unregistered");
    observers.remove(observer);
  }

  }

  @Override
  public void notifyObservers() {
    List<Observer> observerList ;
    synchronized (MUTEX){
      if(Boolean.FALSE.equals(isChanged)){
        return;
      }
      this.isChanged = false;
      observerList = new ArrayList<>(observers);
      observerList.forEach(Observer::update);
  }
  }

  @Override
  public Object getUpdate() {
    return this.message;
  }

  public void postMessage(String message){
    this.message = message;
    this.isChanged = true;
    notifyObservers();
  }
}
