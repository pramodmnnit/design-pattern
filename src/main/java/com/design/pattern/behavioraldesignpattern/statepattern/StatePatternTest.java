package com.design.pattern.behavioraldesignpattern.statepattern;
public class StatePatternTest {

  public static void main(String[] args){

    TVContext context = new TVContext();
    State state =  new TVStartState();
    context.setState(state);
    context.doAction();

    state = new TVStopState();
    context.setState(state);
    context.doAction();
  }
}
