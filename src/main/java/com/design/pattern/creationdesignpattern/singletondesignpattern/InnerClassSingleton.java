package com.design.pattern.creationdesignpattern.singletondesignpattern;

public class InnerClassSingleton {

  private InnerClassSingleton (){

  }

  public InnerClassSingleton getInstance(){
    return SingletonHelper.instance;
  }

  private static  class SingletonHelper {
    private static  final InnerClassSingleton instance = new InnerClassSingleton();
  }
}
