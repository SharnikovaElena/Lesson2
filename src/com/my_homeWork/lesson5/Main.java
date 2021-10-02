package com.my_homeWork.lesson5;

public class Main {
    public static void main(String[] args) {


        Employee worker1 = new Worker("Anna", "Sergeeva", 6);
        Employee worker2 = new Worker("Egor", "Kalina", 2);
        Employee worker3 = new Worker("Ivan", "Eremenko", 2);
        Employee worker4 = new Worker("Alesya", "Tihanova", 6);
        Employee director1 = new Director("Oleg", "Beliaev", 5);
        Employee director2 = new Director("Sergey", "Isaev", 1);

        ((Director)director1).addWorker(worker1);
        ((Director)director1).addWorker(worker2);
        ((Director)director1).addWorker(worker3);
        ((Director)director1).addWorker(director2);

        ((Director)director2).addWorker(worker4);

        System.out.println(director1);

        ServiceSearch serviceSearch = new ServiceSearch();
        serviceSearch.searchNameEmployee((Director) director1, "Alesya");
    }
}

