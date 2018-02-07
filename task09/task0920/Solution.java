package com.javarush.task.task09.task0920;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);

            try{
                Thread.sleep(1000);//напишите тут ваш код
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
