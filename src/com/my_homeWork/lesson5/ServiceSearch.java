package com.my_homeWork.lesson5;

public class ServiceSearch implements MyInterface {

    @Override
    public void searchNameEmployee(Director director, String name) {

        Employee[] employees = director.getEmployees();
        boolean match = false;

        for (Employee employee : employees) {
            if (employee.name == name) {
                match = true;
//                break;
            }
            if (employee.prof == PROF.DIRECTOR) {
                searchNameEmployee((Director) employee, name);
//                return;
            }

            if (match) {
                System.out.println(name + " в подчинении");
            } else {
                System.out.println(name + " не в подчинении у директора");
            }
        }
    }
}

