package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";// алфавит
        char[] abcArray = abc.toCharArray();//разбили строку на символы

        ArrayList<Character> alphabet = new ArrayList<Character>();//записали символы в лист
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for (Character alp : alphabet){//проходим по листу алфавита
            int a = 0;//счетчик сиволов
            for (String l: list){//проходим списку строк введенных пользователя
                for (int i = 0; i < l.length(); i++) {// проходим длинну строки введеную пользователем посимвольно
                    if (l.charAt(i) == alp) a++;//сравниваем символы строки с алфавитом и добавляем в счетчик
                }// напишите тут ваш код
            }
            System.out.println(alp + " " + a);//вывод в консоль
        }
    }

}
