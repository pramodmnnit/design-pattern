package com.design.pattern.behavioraldesignpattern.statepattern;

public class TVStartState implements State {

  @Override
  public void doAction() {
    System.out.println("TV is started");
  }
}
