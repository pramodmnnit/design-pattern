package com.design.pattern.behavioraldesignpattern.statepattern;

/** State design pattern is used when an Object change its behavior based on its internal state. */
public class StatePatternTest {

  public static void main(String[] args) {

    TVContext context = new TVContext();
    State state = new TVStartState();
    context.setState(state);
    context.doAction();

    state = new TVStopState();
    context.setState(state);
    context.doAction();
  }
}
