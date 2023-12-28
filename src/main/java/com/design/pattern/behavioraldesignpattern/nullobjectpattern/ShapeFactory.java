package com.design.pattern.behavioraldesignpattern.nullobjectpattern;

public class ShapeFactory {

  public static Shape createShape(ShapeType shapeType){
    Shape shape;
    if(ShapeType.CIRCLE.equals(shapeType)){
      shape = new Circle();
    } else if (ShapeType.RECTANGLE.equals(shapeType)){
      shape = new Rectangle();
    } else {
      shape = new NullShape();
    }
    return shape;
  }

}
