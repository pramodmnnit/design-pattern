package com.design.pattern.behavioraldesignpattern.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

  private final List<User> users;

  public ChatMediatorImpl() {
    users = new ArrayList<>();
  }

  @Override
  public void sendMessage(String message, User user) {
    for (User each : users) {
      if (each != user) {
        each.receive(message);
      }
    }
  }

  @Override
  public void addUser(User user) {
    users.add(user);
  }
}
