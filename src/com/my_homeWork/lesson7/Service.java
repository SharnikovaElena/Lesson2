package com.my_homeWork.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public boolean searchName(List<User> arrayList, String name) {
        for (Integer i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i).getName() == name) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<User> searchGender(List<User> arrayList, String gender) {
        ArrayList<User> userGender = new ArrayList<>();
        for (Integer y = 0; y < arrayList.size(); y++) {
            if (arrayList.get(y).getGender() == gender) {
                userGender.add(arrayList.get(y));
            }
        }
        return userGender;

    }
}
