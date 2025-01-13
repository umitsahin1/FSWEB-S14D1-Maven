package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(double id, String name, int salary) {
        super(id, name, salary);
    }

    public int getSalary(int salary) {
        return getSalary(300);
    }

    @Override
    public void work() {
        System.out.println("MidDeveloper starts to working");

    }
}
