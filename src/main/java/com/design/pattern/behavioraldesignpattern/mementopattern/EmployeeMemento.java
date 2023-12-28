package com.design.pattern.behavioraldesignpattern.mementopattern;
public class EmployeeMemento {

  private final int empId;
  private final String name;
  private final String designation;
  private final Long salary;
  private final String department;
  private final String project;

  public EmployeeMemento(int empId, String name, String designation, Long salary, String department,
      String project) {
    this.empId = empId;
    this.name = name;
    this.designation = designation;
    this.salary = salary;
    this.department = department;
    this.project = project;
  }

  public int getEmpId() {
    return empId;
  }

  public String getName() {
    return name;
  }

  public String getDesignation() {
    return designation;
  }

  public Long getSalary() {
    return salary;
  }

  public String getDepartment() {
    return department;
  }

  public String getProject() {
    return project;
  }

  @Override
  public String toString() {
    return "EmployeeMemento{" +
        "empId=" + empId +
        ", name='" + name + '\'' +
        ", designation='" + designation + '\'' +
        ", salary=" + salary +
        ", department='" + department + '\'' +
        ", project='" + project + '\'' +
        '}';
  }
}
