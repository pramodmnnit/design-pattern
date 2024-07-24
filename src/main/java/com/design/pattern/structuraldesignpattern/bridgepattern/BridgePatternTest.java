package com.design.pattern.structuraldesignpattern.bridgepattern;

/**
 * When we have interface hierarchies in both interfaces as well as implementations, then bridge
 * design pattern is used to decouple the interfaces from implementation and hiding the
 * implementation details from the client programs Just like Adapter pattern, bridge design pattern
 * is one of the Structural design pattern. According to GoF bridge design pattern is: Decouple an
 * abstraction from its implementation so that the two can vary independently The implementation of
 * bridge design pattern follows the notion to prefer Composition to inheritance.
 */
public class BridgePatternTest {

  public static void main(String[] args) {
    Shape triangleShape = new TriangleShape(new GreenColor());
    triangleShape.applyColor();
    Shape pentagonShape = new PentagonShape(new RedColor());
    pentagonShape.applyColor();
  }
}
