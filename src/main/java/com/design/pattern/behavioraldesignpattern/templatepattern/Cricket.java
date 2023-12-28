package com.design.pattern.behavioraldesignpattern.templatepattern;

public class Cricket extends Game {

  @Override
  protected void initialize() {
    System.out.println("Cricket game initiated, start playing...");
  }

  @Override
  protected void startPlay() {
    System.out.println("Cricket game started, enjoy the game...");
  }

  @Override
  protected void endPlay() {
    System.out.println("Cricket game finished");
  }
}
