package com.emjay;

public class java_arrays {
    public static void main(String[] args) {
        int marks [] = {100,47,87,54,45,34,24,78,97,45,14};
        String names[]= {"Leon","Sam","Sly","Joe"};
        System.out.println(marks[0]);
        try {
            System.out.println(names[10]);
        }
        catch (Exception e)
        {
            System.out.println("error while fetching");
        }


        System.out.println(names[1]);
    }
}
