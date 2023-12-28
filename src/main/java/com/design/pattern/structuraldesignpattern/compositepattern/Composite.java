package com.design.pattern.structuraldesignpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Composite implements Component {

  private final String name;
  private final List<Component> components = new ArrayList<>();

  public Composite(String name) {
    this.name = name;
  }


  public void addComponent(Component component) {
    components.add(component);
  }

  public void removeComponent(Component component) {
    components.remove(component);
  }

  @Override
  public void displayInfo() {
    System.out.println("Directory name:" + name);
    components.forEach(Component::displayInfo);
  }

  @Override
  public Long getSize() {
    AtomicReference<Long> size = new AtomicReference<>(0L);
    components.forEach(each -> size.set(size.get() + each.getSize()));
    return size.get();
  }
}
