package com.design.pattern.behavioraldesignpattern.visitorpattern;

public interface ShoppingCartVisitor {


  Integer visit(Book book);

  Integer visit(Fruit fruit);

}
