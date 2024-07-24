package com.design.pattern.behavioraldesignpattern.mediatorpattern;

public class UserImpl extends User {

  public UserImpl(ChatMediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void send(String message) {
    System.out.println(this.name + " " + "sending the message:" + message);
    mediator.sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println(this.name + " " + "received the message:" + message);
  }
}
