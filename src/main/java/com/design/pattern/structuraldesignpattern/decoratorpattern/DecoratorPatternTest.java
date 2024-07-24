package com.design.pattern.structuraldesignpattern.decoratorpattern;

/**
 * Decorator design pattern is used to modify the functionality of an object at runtime. At the same
 * time other instances of the same class will not be affected by this, so individual object gets
 * the modified behavior. Decorator design pattern is one of the structural design pattern (such as
 * Adapter Pattern, Bridge Pattern, Composite Pattern) and uses abstract classes or interface with
 * composition to implement. We use inheritance or composition to extend the behavior of an object
 * but this is done at compile time, and it's applicable to all the instances of the class. We can’t
 * add any new functionality or remove any existing behavior at runtime - this is when Decorator
 * pattern comes into picture. Suppose we want to implement different kinds of cars - we can create
 * interface Car to define the assembly method, and then we can have a Basic car, furthermore we can
 * extend it to Sports car and Luxury Car. But if we want to get a car at runtime that has both the
 * features of sports car and luxury car, then the implementation gets complex and if furthermore we
 * want to specify which features should be added first, it gets even more complex. Now imagine if
 * we have ten different kind of cars, the implementation logic using inheritance and composition
 * will be impossible to manage. To solve this kind of programming situation, we apply decorator
 * pattern in java. We need to have the following types to implement decorator design pattern.
 */
public class DecoratorPatternTest {

  public static void main(String[] args) {
    Car sportsCar = new SportsCar(new BasicCar());
    sportsCar.assemble();
    System.out.println("\n*****");
    Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
    sportsLuxuryCar.assemble();
    System.out.println("\n*****");
    Car luxuryCar = new LuxuryCar(new BasicCar());
    luxuryCar.assemble();
  }
}
