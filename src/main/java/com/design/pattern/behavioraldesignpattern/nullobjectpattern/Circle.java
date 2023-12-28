package com.design.pattern.behavioraldesignpattern.nullobjectpattern;

public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("Drawing the circle shape");
  }

  @Override
  public boolean isNull() {
    return false;
  }
}
