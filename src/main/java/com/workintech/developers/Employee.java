package com.workintech.developers;

public  class Employee {
  private double  id;
  private String name;
  private  int salary;

    public Employee(double id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void work() {
        System.out.println("Employee starts to working");
    }
}
