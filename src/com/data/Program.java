package com.data;

public class Program {
    public static void main(String[] args) {
        String fullName ="Ngọc";

        Student st1 = new Student();
        // c1: in từng cái
        System.out.println(st1.age);
        System.out.println(st1.address);
        System.out.println(st1.isActive);
        // c2: in nhanh
        System.out.println(st1);
    }
}
