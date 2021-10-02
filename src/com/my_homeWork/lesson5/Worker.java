package com.my_homeWork.lesson5;

    public class Worker extends Employee {

        public Worker(String name, String surname, int workExperience) {
            super(name, surname, workExperience);
        }

        @Override
        public void setProf() {
            this.prof = PROF.WORKER;
        }
    }