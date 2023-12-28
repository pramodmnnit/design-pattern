package com.design.pattern.structuraldesignpattern.flyweightpattern;
public class FlyweightPatternTest {

  public static void main (String [] args){
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
