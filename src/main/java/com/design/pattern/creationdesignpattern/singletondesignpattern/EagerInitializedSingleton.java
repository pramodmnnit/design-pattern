package com.design.pattern.creationdesignpattern.singletondesignpattern;

/**
 * Singleton Pattern Principles
 *
 * <p>Singleton pattern restricts the instantiation of a class and ensures that only one instance of
 * the class exists in the Java Virtual Machine. The singleton class must provide a global access
 * point to get the instance of the class. Singleton pattern is used for logging, drivers objects,
 * caching, and thread pool. Singleton design pattern is also used in other design patterns like
 * Abstract Factory, Builder, Prototype, Facade, etc. Singleton design pattern is used in core Java
 * classes also (for example, java.lang.Runtime, java.awt.Desktop). Java Singleton Pattern
 * Implementation
 *
 * <p>To implement a singleton pattern, we have different approaches, but all of them have the
 * following common concepts.
 *
 * <p>Private constructor to restrict instantiation of the class from other classes. Private static
 * variable of the same class that is the only instance of the class. Public static method that
 * returns the instance of the class, this is the global access point for the outer world to get the
 * instance of the singleton class.
 */

/**
 * In eager initialization, the instance of the singleton class is created at the time of class
 * loading. The drawback to eager initialization is that the method is created even though the
 * client application might not be using it. Here is the implementation of the static initialization
 * singleton class: If your singleton class is not using a lot of resources, this is the approach to
 * use. But in most of the scenarios, singleton classes are created for resources such as File
 * System, Database connections, etc. We should avoid the instantiation unless the client calls the
 * getInstance method. Also, this method doesn’t provide any options for exception handling.
 */
public class EagerInitializedSingleton {

  private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

  private EagerInitializedSingleton() {}

  public static EagerInitializedSingleton getInstance() {
    return instance;
  }
}
