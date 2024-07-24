package com.design.pattern.behavioraldesignpattern.commandpattern;

/**
 * Command Pattern is one of the Behavioral Design Pattern. Command design pattern is used to
 * implement loose coupling in a request-response model. In command pattern, the request is send to
 * the invoker and invoker pass it to the encapsulated command object. Command object passes the
 * request to the appropriate method of Receiver to perform the specific action. The client program
 * create the receiver object and then attach it to the Command. Then it creates the invoker object
 * and attach the command object to perform an action. Now when client program executes the action,
 * it’s processed based on the command and receiver object.
 */
public class FileSystemReceiverTest {

  public static void main(String[] args) {
    FileSystemReceiver fs = new WindowsFileSystemReceiver();
    // creating command and associating with receiver
    OpenFileCommand openFileCommand = new OpenFileCommand(fs);
    // Creating invoker and associating with Command
    FileInvoker file = new FileInvoker(openFileCommand);
    // perform action on invoker object
    file.execute();
    WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
    file = new FileInvoker(writeFileCommand);
    file.execute();
    CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
    file = new FileInvoker(closeFileCommand);
    file.execute();
  }
}
