package com.data.Program_Collection;

import java.util.ArrayList;
import java.util.List;

public class Program_Collection {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        // List(int) listnum2 = new ArrayList<>(); // lỗi int

        listNum.add(14);
        listNum.add(1);
        listNum.add(1);
        listNum.add(2);

        System.out.println(listNum);
        //duyệt
        //lấy phần tử thứ nhất dùng get
        Integer result1 = listNum.get(0);
        System.out.println("result1 = " + result1);

        //lấy phần tử thứ hai dùng get
        Integer result2 = listNum.get(1);
        System.out.println("result2 = " + result2);

        //lấy phần tử thứ 3 dùng get
        Integer result3 = listNum.get(2);
        System.out.println("result3 = "+ result3);
        
        // duyệt list 
        //c1
        for (int i = 0; i < listNum.size(); i++) {
            System.out.println("Value: " + (i +1));
            System.out.println("Value: "+ listNum.get(i));
            System.out.println("==================");
        }
        // c2
        for (Integer obj : listNum) {
            System.out.println("Value: " + obj);
            System.out.println("===================");
        }
        //c3
        listNum.forEach(integer ->{
            System.out.println("Value: "+ integer);

            System.out.println("/////////////////");
        } );
        //// xóa đi phần tử
        System.out.println("Xóa đi phần tử thứ 2");
        listNum.remove(2);
        //duyệt lại mảng
        for (int i = 0; i < listNum.size(); i++) {
            System.out.println("Value ///: " + (i + 1));
            System.out.println("Value: " + listNum.get(i));

        }

        // thêm 1 phần tử
        System.out.println("Thêm 1 phần tử 45 ");
        listNum.add(45);
        //duyệt lại mảng
        listNum.forEach(integer -> {
            System.out.println(integer);
        });
        ////////////////////////////


    }
}

