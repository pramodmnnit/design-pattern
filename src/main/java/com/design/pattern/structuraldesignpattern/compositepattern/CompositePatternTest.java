package com.design.pattern.structuraldesignpattern.compositepattern;

/**
 * The Composite Design Pattern is a structural design pattern that lets you compose objects into
 * tree-like structures to represent part-whole hierarchies. It allows clients to treat individual
 * objects and compositions of objects uniformly. In other words, whether dealing with a single
 * object or a group of objects (composite), clients can use them interchangeably.
 */
public class CompositePatternTest {

  public static void main(String[] args) {
    Component firstFile = new Leaf("File1.txt", 10L);
    Component secondFile = new Leaf("File2.txt", 200L);
    Composite subDirectory = new Composite("Pramod");

    Component thirdFile = new Leaf("File3.txt", 200L);

    subDirectory.addComponent(thirdFile);

    Composite root = new Composite("Root");
    root.addComponent(firstFile);
    root.addComponent(secondFile);
    root.addComponent(subDirectory);

    root.displayInfo();
    System.out.println(root.getSize());
  }
}
