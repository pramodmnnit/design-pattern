package com.design.pattern.behavioraldesignpattern.iteratorpattern;

/**
 * Iterator design pattern in one of the behavioral pattern. Iterator pattern is used to provide a
 * standard way to traverse through a group of Objects. Iterator pattern is widely used in Java
 * Collection Framework. Iterator interface provides methods for traversing through a collection.
 */
public class IteratorPatternTest {

  public static void main(String[] args) {
    NamedRepository repository = new NamedRepository();
    for (Iterator iterator = repository.getIterator(); iterator.hasNext(); ) {
      System.out.println(iterator.next());
    }
  }
}
