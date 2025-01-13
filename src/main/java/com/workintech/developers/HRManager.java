package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(double id, String name, int salary) {
        super(id, name, salary);

    }

    public void addEmployee(JuniorDeveloper junior) {
        addDeveloperToArray(juniorDevelopers, junior);
    }

    public void addEmployee(MidDeveloper mid) {
        addDeveloperToArray(midDevelopers, mid);
    }

    public void addEmployee(SeniorDeveloper senior) {
        addDeveloperToArray(seniorDevelopers, senior);
    }


    private <T> void addDeveloperToArray(T[] developersArray, T developer) {
        for (int i = 0; i < developersArray.length; i++) {
            if (developersArray[i] == null) {
                developersArray[i] = developer;
                System.out.println("Employee added at index " + i);
                return;
            }
        }
        System.out.println("Warning: Array is full, cannot add employee.");
    }


    public int getSalary(int salary) {
        return getSalary(600);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");

    }
}
