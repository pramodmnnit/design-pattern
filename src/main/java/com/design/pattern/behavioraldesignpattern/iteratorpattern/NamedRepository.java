package com.design.pattern.behavioraldesignpattern.iteratorpattern;

public class NamedRepository {

  private final String[] names = {"Item1", "Item2", "Item3", "Item4"};

  public Iterator getIterator() {
    return new NamedIterator(names);
  }
}
