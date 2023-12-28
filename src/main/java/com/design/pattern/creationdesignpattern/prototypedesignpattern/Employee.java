package com.design.pattern.creationdesignpattern.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

  private final List<String> employees;

  public Employee(List<String> employees){
  this.employees =  employees;
  }

  public Employee(){
    this.employees =  new ArrayList<>();
  }

  public void loadEmployees(){
    employees.add("Employee 1");
    employees.add("Employee 2");
    employees.add("Employee 3");
  }

  public List<String> getEmployees(){
    return employees;
  }
  @Override
  public Object clone() throws CloneNotSupportedException{
    List<String> temp = new ArrayList<>(employees);
    return new Employee(temp);
  }
}
