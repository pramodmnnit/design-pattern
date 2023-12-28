package com.design.pattern.behavioraldesignpattern.statepattern;
public class TVStopState implements State {

  @Override
  public void doAction() {
    System.out.println("TV is stopped");
  }
}
