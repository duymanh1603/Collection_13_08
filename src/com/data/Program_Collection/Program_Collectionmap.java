package com.data.Program_Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program_Collectionmap {
    public static void main(String[] args) {
        Map<String,Integer> mapData = new HashMap<>();
        mapData.put("age" ,15);
        mapData.put("money" ,1100);
        mapData.put("height" ,180);

        System.out.println("age: ");
        System.out.println(mapData.get("age"));
        System.out.println(mapData.get("age2"));
        System.out.println("///////");

        mapData.put(null,14);
        System.out.println("get key null: ");
        System.out.println(mapData.get(null));
        // kiểu của String và Integer cũng có chưa null.

        mapData.put(null,null);
        System.out.println("get key null 2 : ");
        System.out.println(mapData.get(null));

    }
}

