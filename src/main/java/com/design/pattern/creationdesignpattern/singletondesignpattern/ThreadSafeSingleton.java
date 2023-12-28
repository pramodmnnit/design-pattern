package com.design.pattern.creationdesignpattern.singletondesignpattern;

import java.util.Objects;

public class ThreadSafeSingleton {

  private static ThreadSafeSingleton instance;

  private ThreadSafeSingleton () {

  }

  public static ThreadSafeSingleton getInstance() {
    if(Objects.isNull(instance)){
      synchronized (ThreadSafeSingleton.class){
        instance = new ThreadSafeSingleton();
      }
    }
    return instance;
  }
}
