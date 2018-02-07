package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
//        ArrayList<Integer> array = new ArrayList<Integer>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            int i = 0;
//            while (i == 0) try {
//                array.add(Integer.parseInt(reader.readLine()));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        catch (NumberFormatException e) {
//            for(Integer value : array) System.out.println(value);
//        }
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();


        try {
            while (true) {
                try {
                    list.add(scanner.nextInt());
                } catch (NumberFormatException n) {

                }
            }
        } catch (Exception e) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            //напишите тут ваш код
        }
    }
}
