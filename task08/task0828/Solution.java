package com.javarush.task.task08.task0828;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        String month;

        for (int i = 1; i < 13; i++) {

            map.put(Month.of(i).toString(), i);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        month = reader.readLine();

        System.out.println( month + " is " + map.get(month.toUpperCase()) + " month");
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"January");//напишите тут ваш код
//        map.put(2,"February");//напишите тут ваш код
//        map.put(3,"March");//напишите тут ваш код
//        map.put(4,"April");//напишите тут ваш код
//        map.put(5,"May");//напишите тут ваш код
//        map.put(6,"June");//напишите тут ваш код
//        map.put(7,"July");//напишите тут ваш код
//        map.put(8,"August");//напишите тут ваш код
//        map.put(9,"September");//напишите тут ваш код
//        map.put(10,"October");//напишите тут ваш код
//        map.put(11,"November");//напишите тут ваш код
//        map.put(12,"December");//напишите тут ваш код
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String input = reader.readLine();
//
//        for (int i = 0; i < map.size(); i++) {
//            System.out.println(map.containsValue(input));
//        }
    }
}
