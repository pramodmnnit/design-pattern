package com.design.pattern.structuraldesignpattern.bridgepattern;
public class PentagonShape extends Shape{

  public PentagonShape(Color color) {
    super(color);
  }

  @Override
  public void applyColor() {
    System.out.print("Pentagon filled with color");
  this.color.applyColor();
  }
}
