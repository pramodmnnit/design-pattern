package com.design.pattern.behavioraldesignpattern.templatepattern;

/***
 * Template method defines the steps to execute an algorithm.
 * it can provide default implementation that might be common for all or some of the subclasses
 */

public class TemplatePatternTest {

  public static void main(String[] args) {

    Game game = new Cricket();
    game.play();
    game = new Football();
    game.play();
  }
}
