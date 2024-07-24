package com.design.pattern.behavioraldesignpattern.mediatorpattern;

/**
 * Mediator design pattern is one of the behavioral design pattern, so it deals with the behaviors
 * of objects. Mediator design pattern is used to provide a centralized communication medium between
 * different objects in a system.
 */
public class MediatorPatternTest {

  public static void main(String[] args) {
    ChatMediator mediator = new ChatMediatorImpl();
    User user1 = new UserImpl(mediator, "Pankaj");
    User user2 = new UserImpl(mediator, "Lisa");
    User user3 = new UserImpl(mediator, "Saurabh");
    User user4 = new UserImpl(mediator, "David");
    mediator.addUser(user1);
    mediator.addUser(user2);
    mediator.addUser(user3);
    mediator.addUser(user4);

    user1.send("Hi All");
    user2.send("Hi");
  }
}
