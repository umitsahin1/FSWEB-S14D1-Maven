package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(double id, String name, int salary) {
        super(id, name, salary);
    }


    public int getSalary(int salary) {
        return getSalary(800);
    }

    @Override
    public void work() {
        System.out.println("Employee starts to working");

    }
}

