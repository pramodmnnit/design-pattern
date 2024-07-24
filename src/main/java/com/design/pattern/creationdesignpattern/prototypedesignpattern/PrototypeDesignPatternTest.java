package com.design.pattern.creationdesignpattern.prototypedesignpattern;

/**
 * Prototype design pattern is used when the Object creation is a costly affair and requires a lot
 * of time and resources, and you have a similar object already existing. Prototype pattern provides
 * a mechanism to copy the original object to a new object and then modify it according to our
 * needs. Prototype design pattern uses java cloning to copy the object. It would be easy to
 * understand prototype design pattern with an example. Suppose we have an Object that loads data
 * from database. Now we need to modify this data in our program multiple times, so it’s not a good
 * idea to create the Object using new keyword and load all the data again from database. The better
 * approach would be to clone the existing object into a new object and then do the data
 * manipulation. Prototype design pattern mandates that the Object which you are copying should
 * provide the copying feature. It should not be done by any other class. However whether to use
 * shallow or deep copy of the Object properties depends on the requirements and its a design
 * decision.
 */
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
