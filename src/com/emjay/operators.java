package com.emjay;

public class operators {
    public static void main(String[] args) {
//        comparison < > >= <=
        System.out.println(10-20);
        String fname= "john";
        String lname="mark";
        int age=21;
        String full_name=fname +" "+ lname+" "+age;
        System.out.println(full_name);
        System.out.println(10/(double)3);
//        casting
        int z = 10;
        System.out.println( (double) z  );
        int k = (int)12.6;
        System.out.println(k);

        System.out.println(10>20);
        System.out.println(10<=20);
        System.out.println(10==10.0);
        int j=10;
        double h =10.0;
        System.out.println(j == h);
        String name = "Joe";
        String jina ="joe";
        System.out.println(name == jina);/*WRONG WAY*/
        System.out.println(name.equals(jina));
        System.out.println(name.equalsIgnoreCase(jina));
        System.out.println(1000%44);/*modulus*/
        System.out.println(100>200 && "jina".equals("jina"));
        System.out.println(100>200 || "jina".equals("jina"));
        System.out.println(10!=20);
        System.out.println( ! "Kenya".equals("kenya"));


    }
}
