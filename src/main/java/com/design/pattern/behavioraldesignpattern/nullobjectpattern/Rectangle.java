package com.design.pattern.behavioraldesignpattern.nullobjectpattern;

public class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.println("Drawing the rectangle shape");
  }

  @Override
  public boolean isNull() {
    return false;
  }
}
