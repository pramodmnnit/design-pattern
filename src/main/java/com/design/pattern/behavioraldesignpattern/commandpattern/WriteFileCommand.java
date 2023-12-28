package com.design.pattern.behavioraldesignpattern.commandpattern;

public class WriteFileCommand implements Command {

  FileSystemReceiver fileSystemReceiver;

  public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
    this.fileSystemReceiver = fileSystemReceiver;
  }

  @Override
  public void execute() {
    this.fileSystemReceiver.writefile();
  }
}
