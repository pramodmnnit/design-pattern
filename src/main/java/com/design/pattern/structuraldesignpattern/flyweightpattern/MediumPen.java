package com.design.pattern.structuraldesignpattern.flyweightpattern;
public class MediumPen implements Pen {

  private final BrushType brushType = BrushType.MEDIUM;
  private String color = null;

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println("Drawing for pen type:" + brushType + " in color:" + this.color);
  }
}
