package com.design.pattern.structuraldesignpattern.bridgepattern;

public class BridgePatternTest {

  public static void main(String [] args){
    Shape shape = new TriangleShape(new GreenColor());
    shape.applyColor();
    Shape pentagon = new PentagonShape(new RedColor());
    pentagon.applyColor();

  }
}
