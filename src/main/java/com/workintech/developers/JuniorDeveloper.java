package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(double id, String name, int salary) {
        super(id, name, salary);
    }

    public int getSalary(int salary) {
        return getSalary(200);
    }

    @Override
    public void work() {
        System.out.println("JuniorDeveloper starts to working");

    }
}
