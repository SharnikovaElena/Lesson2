package com.my_homeWork.lesson5;

public enum PROF {

    DIRECTOR (3),
    WORKER (1);

    private int coefficient;

    PROF(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }
}

