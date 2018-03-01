package com.javarush.task.task10.task1019;

        import java.io.*;
        import java.util.HashMap;
        import java.util.Map;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String s = reader.readLine();
            if (s.equals("")) break;
            map.put(reader.readLine(), Integer.parseInt(s));
        }
        map.forEach((i,s) -> System.out.println(s + " " + i));
        //System.out.println("Id=" + id + " Name=" + name);
    }
}
