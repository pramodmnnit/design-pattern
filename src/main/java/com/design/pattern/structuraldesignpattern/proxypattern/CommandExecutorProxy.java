package com.design.pattern.structuraldesignpattern.proxypattern;

public class CommandExecutorProxy implements CommandExecutor {

  private final CommandExecutor commandExecutor;
  private boolean isAdmin = false;

  public CommandExecutorProxy(String username, String password){
    if(username.equals("pramod") && password.equals("@12345")){
      isAdmin = true;
    }
    commandExecutor = new CommandExecutorImpl();
  }

  @Override
  public void runCommand(String command) throws Exception {
    if(isAdmin){
      commandExecutor.runCommand(command);
    } else {
      if(command.trim().startsWith("rm")){
        throw new Exception(command + " is not supported");
      } else {
        commandExecutor.runCommand(command);
      }
    }
  }
}
