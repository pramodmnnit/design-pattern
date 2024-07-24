package com.design.pattern.structuraldesignpattern.bridgepattern;

public class TriangleShape extends Shape {

  public TriangleShape(Color color) {
    super(color);
  }

  @Override
  public void applyColor() {
    System.out.print("Triangle filled with color");
    this.color.applyColor();
  }
}
