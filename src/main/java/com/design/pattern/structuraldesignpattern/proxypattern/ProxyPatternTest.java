package com.design.pattern.structuraldesignpattern.proxypattern;

/**
 * Proxy design pattern intent according to GoF is: Provide a surrogate or placeholder for another
 * object to control access to it. The definition itself is very clear and proxy design pattern is
 * used when we want to provide controlled access of a functionality. Let’s say we have a class that
 * can run some command on the system. Now if we are using it, its fine but if we want to give this
 * program to a client application, it can have severe issues because client program can issue
 * command to delete some system files or change some settings that you don’t want. Here a proxy
 * class can be created to provide controlled access of the program.
 */
public class ProxyPatternTest {

  public static void main(String[] args) {
    CommandExecutor executor = new CommandExecutorProxy("Pramod", "wrong_pwd");
    try {
      executor.runCommand("ls -ltr");
      executor.runCommand(" rm -rf abc.pdf");
    } catch (Exception e) {
      System.out.println("Exception Message::" + e.getMessage());
    }
  }
}
