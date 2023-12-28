package com.design.pattern.behavioraldesignpattern.commandpattern;

public class OpenFileCommand implements Command {

  FileSystemReceiver fileSystemReceiver;

  public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
    this.fileSystemReceiver = fileSystemReceiver;
  }

  @Override
  public void execute() {
    this.fileSystemReceiver.openFile();
  }
}
