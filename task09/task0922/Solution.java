package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        Date date = new Date(new BufferedReader(new InputStreamReader(System.in)).readLine());
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format(date).toUpperCase());
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите дату в формате MM/dd/yyyy");
//        String s = scanner.nextLine();
//
//        SimpleDateFormat a = new SimpleDateFormat("MM/dd/yyyy");
//        Date date = a.parse(s);
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
//        System.out.println(dateFormat.format(date).toUpperCase());//напишите тут ваш код
    }
}
