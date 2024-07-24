package com.design.pattern.behavioraldesignpattern.mementopattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EmployeeCaretaker {

  private final Map<Integer, Map<String, EmployeeMemento>> mementoHistory = new HashMap<>();

  public void addMemento(int empId, String mementoMessage, EmployeeMemento employeeMemento) {
    Map<String, EmployeeMemento> employeeMementoMap =
        mementoHistory.getOrDefault(empId, new HashMap<>());
    employeeMementoMap.put(mementoMessage, employeeMemento);
    mementoHistory.put(empId, employeeMementoMap);
    System.out.println(
        "Employee name:" + employeeMemento.getName() + " stored with message:" + mementoMessage);
  }

  public EmployeeMemento getEmployeeMemento(int empId, String mementoMessage) {
    if (Objects.isNull(mementoHistory.getOrDefault(empId, new HashMap<>()).get(mementoMessage))) {
      System.out.println(
          "Memento object not found for emp id:"
              + empId
              + " for memento message:"
              + mementoMessage);
      return null;
    } else {
      return mementoHistory.get(empId).get(mementoMessage);
    }
  }

  public void printMementoHistory() {
    mementoHistory.forEach(
        (empId, employeeMementoMap) ->
            employeeMementoMap.forEach(
                (message, employeeMemento) ->
                    System.out.printf(
                        "EmpId: '%d', Message: '%s', Memento: '%s'\n",
                        empId, message, employeeMemento)));
  }
}
