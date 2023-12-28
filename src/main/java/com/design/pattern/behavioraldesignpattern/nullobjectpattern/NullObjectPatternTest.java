package com.design.pattern.behavioraldesignpattern.nullobjectpattern;

public class NullObjectPatternTest {

  public static void main (String [] args){

    Shape shape = ShapeFactory.createShape(null);
    shape.draw();
    shape = ShapeFactory.createShape(ShapeType.CIRCLE);
    shape.draw();
    shape = ShapeFactory.createShape(ShapeType.RECTANGLE);
    shape.draw();
  }
}
