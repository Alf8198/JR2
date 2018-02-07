package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {

        ArrayList<int[]> list = new ArrayList<>();

        int[] a = {1,1,1,1,1};//напишите тут ваш код
        int[] b = {2,2};//напишите тут ваш код
        int[] c = {3,3,3,3};//напишите тут ваш код
        int[] d = {4,4,4,4,4,4,4};//напишите тут ваш код
        int[] f = new int[0];
        list.add(a);//напишите тут ваш код
        list.add(b);//напишите тут ваш код
        list.add(c);//напишите тут ваш код
        list.add(d);//напишите тут ваш код
        list.add(f);

        return list;//напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.print(x);
                System.out.println();
            }
        }
    }
}
