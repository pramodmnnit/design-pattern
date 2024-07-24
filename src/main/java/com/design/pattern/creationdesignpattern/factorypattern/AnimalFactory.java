package com.design.pattern.creationdesignpattern.factorypattern;

public class AnimalFactory {

  public static Animal getAnimal(AnimalType type) {
    if (AnimalType.CAT.equals(type)) {
      return new Cat();
    } else if (AnimalType.DOG.equals(type)) {
      return new Dog();
    } else if (AnimalType.TIGER.equals(type)) {
      return new Tiger();
    } else if (AnimalType.LION.equals(type)) {
      return new Lion();
    } else {
      return null;
    }
  }
}
