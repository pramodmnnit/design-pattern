package com.design.pattern.creationdesignpattern.singletondesignpattern;

import java.lang.reflect.Constructor;

public class Reflection {

  public static void main(String[] args) {
    EagerInitializedSingleton initializedSingleton = EagerInitializedSingleton.getInstance();
    EagerInitializedSingleton eagerInitializedSingleton = null;
    try {
      Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        constructor.setAccessible(true);
        eagerInitializedSingleton = (EagerInitializedSingleton) constructor.newInstance();
        break;
      }

    } catch (Exception ex) {
      ex.printStackTrace();
    }
    System.out.println(initializedSingleton.hashCode());
    System.out.println(eagerInitializedSingleton.hashCode());
  }
}
