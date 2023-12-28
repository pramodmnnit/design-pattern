package com.design.pattern.behavioraldesignpattern.mediatorpattern;
public interface ChatMediator {

 void  sendMessage(String message, User user);
 void addUser(User user);
}
