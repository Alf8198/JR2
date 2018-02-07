package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov","Ivan");
        map.put("Ivanov","Ivan");
        map.put("Ivanov","Fedot");
        map.put("Pavlov","Petya");
        map.put("Igoty","Gret");
        map.put("Plkdsf","Gret");
        map.put("Idvv","Ivzxvxn");
        map.put("Ivvdgz","Igszgz");
        map.put("Ivanzgzg","Ivagzd");
        map.put("IvangFGd","Ivadcgn");
        //напишите тут ваш код

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
