package com.my_homeWork.lesson5;

public abstract class Employee extends Person {

    protected int workExperience;
    protected PROF prof;
    private int basic = 1000;

public Employee (String name, String surname, int workExperience) {
    super(name, surname);
    this.workExperience = workExperience;
    setProf ();
}

    public abstract void setProf();

    public int getSalary() {

        return  basic * workExperience * prof.getCoefficient();
    }

    @Override
    public String toString() {
        return "Employee{" + " name= " + name + ", surname= " + surname +
                ", workExperience= " + workExperience +
                ", prof= " + prof +
                ", salary= " + getSalary() +
                '}';
    }


}


