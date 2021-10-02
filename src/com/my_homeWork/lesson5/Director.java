package com.my_homeWork.lesson5;

import java.util.Arrays;

public class Director extends Employee {

    private Employee[] employees;

    public Director(String name, String surname, int workExperiences) {

        super(name, surname, workExperiences);
    }

    public void addWorker(Employee employee) {
        if (employees == null) {
            employees = new Employee[1];
            employees[0] = employee;
        } else {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
        }
    }

    @Override
    public void setProf() {
        this.prof = PROF.DIRECTOR;
    }

    @Override
    public int getSalary() {
        if (employees == null) {
            return super.getSalary();
        } else {
            return (super.getSalary() * employees.length);
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return ("Director{" + " name= " + name + ", surmame= " + surname + ", prof= " + prof + ", salary " + getSalary() + ", employees= " + Arrays.toString(employees) + '}');
    }
}

