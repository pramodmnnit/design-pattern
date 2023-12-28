package com.design.pattern.behavioraldesignpattern.mementopattern;

public class MementoPatternTest {

  public static void main (String [] args){
    EmployeeCaretaker caretaker = new EmployeeCaretaker();
    System.out.println("creating employee objects with intial values");
    Employee racheal = new Employee(100);
    racheal.setName("Racheal");
    racheal.setDesignation("Lead");
    racheal.setSalary(100000L);
    racheal.setDepartment("R&D");
    racheal.setProject("Transportation Management");
    Employee micheal = new Employee(101);
    micheal.setName("Micheal");
    micheal.setDesignation("Developer");
    micheal.setSalary(75000L);
    micheal.setDepartment("Engineering");
    micheal.setProject("IoT");
    System.out.println(racheal);
    System.out.println(micheal);
    EmployeeMemento rachealMemento = racheal.createMemento();
    EmployeeMemento michealMemento = micheal.createMemento();
    caretaker.addMemento(racheal.getEmpId(), "Saved at intitial stage", rachealMemento);
    caretaker.addMemento(micheal.getEmpId(), "Saved at intitial stage", michealMemento);
    System.out.println("\nracheal got promotion");
    racheal.setDesignation("Manager");
    racheal.setSalary(120000L);
    System.out.println("micheal assigned to another project.");
    micheal.setProject("Android App");
    System.out.println(racheal);
    System.out.println(micheal);
    rachealMemento = racheal.createMemento();
    michealMemento = micheal.createMemento();
    caretaker.addMemento(racheal.getEmpId(), "Saved at promotion", rachealMemento);
    caretaker.addMemento(micheal.getEmpId(), "Saved at android project", michealMemento);
    System.out.println("\nracheal got increment");
    racheal.setSalary(140000L);
    System.out.println("micheal got promotion");
    micheal.setDesignation("Lead Developer");
    micheal.setSalary(90000L);
    System.out.println(racheal);
    System.out.println(micheal);
    rachealMemento = racheal.createMemento();
    michealMemento = micheal.createMemento();
    caretaker.addMemento(racheal.getEmpId(), "Saved at increment", rachealMemento);
    caretaker.addMemento(micheal.getEmpId(), "Saved at promotion", michealMemento);
    System.out.println("\nLet's print the stored memento objects we have");
    caretaker.printMementoHistory();
    System.out.println("\nnow for some reason, we like to revert racheal to initial stage.");
    System.out.println("and micheal to android project.");
    rachealMemento = caretaker.getEmployeeMemento(racheal.getEmpId(), "Saved at intitial stage");
    michealMemento = caretaker.getEmployeeMemento(micheal.getEmpId(), "Saved at android project");
    racheal.restore(rachealMemento);
    micheal.restore(michealMemento);
    System.out.println(racheal);
    System.out.println(micheal);

  }
}
