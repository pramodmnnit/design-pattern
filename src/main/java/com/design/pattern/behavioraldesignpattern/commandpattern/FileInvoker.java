package com.design.pattern.behavioraldesignpattern.commandpattern;

public class FileInvoker {

  Command command;

  public FileInvoker(Command command) {
    this.command = command;
  }

  public void execute() {
    this.command.execute();
  }
}
