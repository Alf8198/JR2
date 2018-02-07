package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

import static java.util.Collections.reverseOrder;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[] array = new int[20];
//        for (int i = 0; i < 20; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//        }
//
//        sort(array);
//
//        for (int x : array) {
//            System.out.println(x);
//        }
//    }
//
//    public static void sort(int[] array) {
//        Arrays.sort(array);
//        int[] a1 = new int[array.length];
//        int a = 0;
//        for (int i = array.length - 1; i >= 0; i--) {
//            a1[a] = array[i];
//            a++;
//        }
//        System.arraycopy(a1, 0, array, 0, array.length);
//        a1 = null;
    }
}


