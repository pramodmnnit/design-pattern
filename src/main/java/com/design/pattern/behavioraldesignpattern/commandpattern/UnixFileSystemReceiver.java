package com.design.pattern.behavioraldesignpattern.commandpattern;

public class UnixFileSystemReceiver implements FileSystemReceiver {

  @Override
  public void openFile() {
    System.out.println("File open for unix os");
  }

  @Override
  public void closeFile() {
    System.out.println("File close for unix os");
  }

  @Override
  public void writefile() {
    System.out.println("File written for unix os");
  }
}
