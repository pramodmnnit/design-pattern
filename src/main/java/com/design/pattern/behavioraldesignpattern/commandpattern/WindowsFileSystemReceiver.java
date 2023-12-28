package com.design.pattern.behavioraldesignpattern.commandpattern;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

  @Override
  public void openFile() {
    System.out.println("File opened for Windows OS");
  }

  @Override
  public void closeFile() {
    System.out.println("File closed for Windows OS");
  }

  @Override
  public void writefile() {
    System.out.println("File written for Windows OS");
  }
}