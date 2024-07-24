package com.design.pattern.behavioraldesignpattern.mementopattern;

import java.util.Objects;

public class Employee {

  private final int empId;
  private String name;
  private String designation;
  private Long salary;
  private String department;
  private String project;

  public Employee(int empId) {
    this.empId = empId;
  }

  public int getEmpId() {
    return this.empId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Long getSalary() {
    return salary;
  }

  public void setSalary(Long salary) {
    this.salary = salary;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  @Override
  public String toString() {
    return "Employee{"
        + "empId="
        + empId
        + ", name='"
        + name
        + '\''
        + ", designation='"
        + designation
        + '\''
        + ", salary="
        + salary
        + ", department='"
        + department
        + '\''
        + ", project='"
        + project
        + '\''
        + '}';
  }

  public EmployeeMemento createMemento() {
    return new EmployeeMemento(
        this.empId, this.name, this.designation, this.salary, this.department, this.project);
  }

  public void restore(EmployeeMemento employeeMemento) {
    if (Objects.isNull(employeeMemento)) {
      throw new NullPointerException("Employee memento object is null");
    }
    this.department = employeeMemento.getDepartment();
    this.designation = employeeMemento.getDesignation();
    this.name = employeeMemento.getName();
    this.project = employeeMemento.getProject();
    this.salary = employeeMemento.getSalary();
  }
}
