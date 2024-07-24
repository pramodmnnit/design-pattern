package com.design.pattern.behavioraldesignpattern.iteratorpattern;

public class NamedIterator implements Iterator {

  private final String[] names;
  private int index;

  public NamedIterator(String[] names) {
    this.index = 0;
    this.names = names;
  }

  @Override
  public boolean hasNext() {
    return index < names.length;
  }

  @Override
  public Object next() {
    if (hasNext()) {
      return names[index++];
    }
    return null;
  }
}
