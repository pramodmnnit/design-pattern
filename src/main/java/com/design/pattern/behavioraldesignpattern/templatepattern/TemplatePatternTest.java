package com.design.pattern.behavioraldesignpattern.templatepattern;

public class TemplatePatternTest {

  public static void main(String[] args) {

    Game game = new Cricket();
    game.play();
    game = new Football();
    game.play();

  }
}
