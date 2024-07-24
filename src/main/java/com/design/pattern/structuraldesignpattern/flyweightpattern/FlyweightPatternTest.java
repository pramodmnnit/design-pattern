package com.design.pattern.structuraldesignpattern.flyweightpattern;

/**
 * Flyweight design pattern is a Structural design pattern like Facade pattern, Adapter Pattern and
 * Decorator pattern. Flyweight design pattern is used when we need to create a lot of Objects of a
 * class. Since every object consumes memory space that can be crucial for low memory devices, such
 * as mobile devices or embedded systems, flyweight design pattern can be applied to reduce the load
 * on memory by sharing objects. Before we apply flyweight design pattern, we need to consider
 * following factors: The number of Objects to be created by application should be huge. The object
 * creation is heavy on memory, and it can be time-consuming too.
 */
public class FlyweightPatternTest {

  public static void main(String[] args) {
    Pen thickPen = PenFactory.getPen("yellow", BrushType.THICK);
    thickPen.setColor("yellow");
    thickPen.draw();
    Pen thinPen = PenFactory.getPen("blue", BrushType.THIN);
    thinPen.setColor("blue");
    thinPen.draw();

    Pen mediumPen = PenFactory.getPen("red", BrushType.MEDIUM);
    mediumPen.setColor("red");
    mediumPen.draw();

    Pen thinPen2 = PenFactory.getPen("blue", BrushType.THIN);
    thinPen2.setColor("blue");
    thinPen2.draw();
  }
}
