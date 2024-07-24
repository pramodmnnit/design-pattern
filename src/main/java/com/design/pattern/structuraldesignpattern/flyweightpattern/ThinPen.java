package com.design.pattern.structuraldesignpattern.flyweightpattern;

public class ThinPen implements Pen {

  private static final BrushType brushType = BrushType.THIN;
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
