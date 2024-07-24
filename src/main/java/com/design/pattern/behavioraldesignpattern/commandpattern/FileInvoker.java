package com.design.pattern.behavioraldesignpattern.commandpattern;

public class FileInvoker {

  private final Command command;

  public FileInvoker(Command command) {
    this.command = command;
  }

  public void execute() {
    this.command.execute();
  }
}
