package com.design.pattern.behavioraldesignpattern.commandpattern;

public class CloseFileCommand implements Command {

  private final FileSystemReceiver fileSystemReceiver;

  public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
    this.fileSystemReceiver = fileSystemReceiver;
  }

  @Override
  public void execute() {
    this.fileSystemReceiver.closeFile();
  }
}
