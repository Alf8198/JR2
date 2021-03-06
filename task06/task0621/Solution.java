package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String garndmotherName = reader.readLine();
        Cat catGarndmother = new Cat(garndmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGarndmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGarndmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat parent2){
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent == null && parent2 == null)
                return "Cat name is " + name + ", no mother " + ", no father";
            if (parent2 == null)
                return "Cat name is " + name + ", mother is " + parent.name + ", no father";
            if (parent == null)
                return "Cat name is " + name + ", no mother " + ", father is " + parent2.name;
            else
                return "Cat name is " + name + ", mother is " + parent.name + ", father is " + parent2.name;
        }

    }

}
