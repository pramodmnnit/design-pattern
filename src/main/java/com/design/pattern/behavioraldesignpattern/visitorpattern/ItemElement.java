package com.design.pattern.behavioraldesignpattern.visitorpattern;

public interface ItemElement {

  int accept(ShoppingCartVisitor visitor);

}
