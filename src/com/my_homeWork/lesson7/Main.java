package com.my_homeWork.lesson7;


import java.util.*;


public class Main {
    public static void main(String[] args) {

        User user1 = new User ("Ivan",20, "man");
        User user2 = new User("Anton", 16, "man");
        User user3 = new User("Kate", 16, "fem");
        User user4 = new User("Anna", 20, "fem");

        List<User> user = new ArrayList<>();
        user.add(user1);
        user.add(user3);
        user.add(user2);
        Service service = new Service();
        System.out.println(service.searchName(user, "Anton"));
        System.out.println(service.searchGender(user,"man"));

        Set<User> setUser = new HashSet<>();
        setUser.add(user1);
        setUser.add(user2);
        setUser.add(user4);

        System.out.println(setUser.toString());

        TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(user4);
        userTreeSet.add(user1);
        userTreeSet.add(user3);
        userTreeSet.add(user2);
//        userTreeSet.addAll(user);
        System.out.println(userTreeSet);

      }
}
