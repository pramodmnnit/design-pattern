package com.design.pattern.creationdesignpattern.singletondesignpattern;

import java.util.Objects;

/**
 * A simple way to create a thread-safe singleton class is to make the global access method
 * synchronized so that only one thread can execute this method at a time. mplementation works fine
 * and provides thread-safety, but it reduces the performance because of the cost associated with
 * the synchronized method, although we need it only for the first few threads that might create
 * separate instances. To avoid this extra overhead every time, double-checked locking principle is
 * used. In this approach, the synchronized block is used inside the if condition with an additional
 * check to ensure that only one instance of a singleton class is created.
 */
public class ThreadSafeSingleton {

  private static ThreadSafeSingleton instance;

  private ThreadSafeSingleton() {}

  public static ThreadSafeSingleton getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (ThreadSafeSingleton.class) {
        if (Objects.isNull(instance)) {
          instance = new ThreadSafeSingleton();
        }
      }
    }
    return instance;
  }
}
