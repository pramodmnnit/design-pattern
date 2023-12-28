package com.design.pattern.behavioraldesignpattern.templatepattern;

public abstract class Game {

  public final void play() {
    initialize();
    startPlay();
    endPlay();
  }

  protected abstract void initialize();

  protected abstract void startPlay();

  protected abstract void endPlay();

}
