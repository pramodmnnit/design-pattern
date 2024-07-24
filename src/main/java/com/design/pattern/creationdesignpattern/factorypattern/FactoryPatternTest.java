package com.design.pattern.creationdesignpattern.factorypattern;

/**
 * Factory Pattern is one of the creational Design pattern and it’s widely used in JDK as well as
 * frameworks like Spring and Struts. The factory design pattern is used when we have a superclass
 * with multiple sub-classes and based on input, we need to return one of the sub-class. This
 * pattern takes out the responsibility of the instantiation of a class from the client program to
 * the factory class. Note that this pattern is also known as Factory Method Design Pattern.
 */
public class FactoryPatternTest {

  public static void main(String[] args) {
    Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
    assert animal != null;
    animal.eat();
    animal = AnimalFactory.getAnimal(AnimalType.CAT);
    assert animal != null;
    animal.eat();
  }
}
