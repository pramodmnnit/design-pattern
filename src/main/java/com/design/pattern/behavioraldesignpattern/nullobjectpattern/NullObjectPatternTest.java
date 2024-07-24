package com.design.pattern.behavioraldesignpattern.nullobjectpattern;

/**
 * Null design pattern that is used to provide a consistent way of handling null or non-existing
 * objects. It is particularly useful in situations where you want to avoid explicit null checks and
 * provide a default behavior for objects that may not exist
 */
public class NullObjectPatternTest {

  public static void main(String[] args) {

    Shape shape = ShapeFactory.createShape(null);
    shape.draw();
    shape = ShapeFactory.createShape(ShapeType.CIRCLE);
    shape.draw();
    shape = ShapeFactory.createShape(ShapeType.RECTANGLE);
    shape.draw();
  }
}
