package com.design.pattern.structuraldesignpattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PenFactory {
  private static final Map<String, Pen> pens = new HashMap<>() ;
  public static Pen getPen(String color, BrushType type){
    if(Objects.isNull(pens.get(type + "_" + color))){
      System.out.println("Creating new object for type " + type + " and color " + color);
      if(type.equals(BrushType.THIN)){
        pens.put(type + "_" + color, new ThinPen());
      } else if (type.equals(BrushType.MEDIUM)){
        pens.put(type + "_" + color, new MediumPen());
      } else {
        pens.put(type + "_" + color, new ThickPen());
      }
    }
    return pens.get(type + "_" + color);
  }
}
