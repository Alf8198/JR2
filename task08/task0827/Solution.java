package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date d1 = new Date(date);
        Date d2 = new Date(date);
        d1.setDate(0);
        d1.setMonth(0);

        long a = (d2.getTime() - d1.getTime())/(3600*24*1000);
        if (a % 2 != 0) {
            return true;}
        else {
            return false;}
    }
}
