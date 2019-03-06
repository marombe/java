package com.emjay;

import java.util.ArrayList;

public class Java_arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("johm");
        names.add("mark");
        names.add("chris");
        names.add("musa");
        names.add("sly");
        System.out.println(names.get(1));

        names.remove(2);
        System.out.println(names.size());

        names.clear();
        System.out.println(names.size());


    }


}
