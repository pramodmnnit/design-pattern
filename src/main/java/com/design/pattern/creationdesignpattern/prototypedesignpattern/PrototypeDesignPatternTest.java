package com.design.pattern.creationdesignpattern.prototypedesignpattern;


public class PrototypeDesignPatternTest {

  public static void main(String[] args) throws CloneNotSupportedException {
    Employee employee = new Employee();
    employee.loadEmployees();
   Employee employee1 = (Employee) employee.clone();
   Employee employee2 = (Employee) employee.clone();
   employee1.getEmployees().add("Employee 4");
   employee2.getEmployees().remove(2);
   System.out.println(employee1.getEmployees());
   System.out.println(employee.getEmployees());
   System.out.println(employee2.getEmployees());

  }
}
