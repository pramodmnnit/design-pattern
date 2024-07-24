package com.design.pattern.behavioraldesignpattern.statepattern;

public class TVContext implements State {

  private State state;

  public void setState(State state) {
    this.state = state;
  }

  @Override
  public void doAction() {
    this.state.doAction();
  }
}
