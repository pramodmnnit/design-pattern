package com.design.pattern.behavioraldesignpattern.templatepattern;

public class Football extends Game {

  @Override
  protected void initialize() {
    System.out.println("football game initiated, start playing...");
  }

  @Override
  protected void startPlay() {
    System.out.println("Football game started, enjoy the game");
  }

  @Override
  protected void endPlay() {
    System.out.println("Football game finished");
  }
}
