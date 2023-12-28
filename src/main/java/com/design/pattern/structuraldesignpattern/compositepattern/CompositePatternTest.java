package com.design.pattern.structuraldesignpattern.compositepattern;

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
