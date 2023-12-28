package com.design.pattern.behavioraldesignpattern.nullobjectpattern;

public class NullShape implements Shape{

  @Override
  public void draw() {
    System.out.println("Null shape can't be drawn");
  }

  @Override
  public boolean isNull() {
    return true;
  }
}
