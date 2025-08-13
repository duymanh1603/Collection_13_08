package com.data.Program_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program_Collectionset {
    public static void main(String[] args) {
        Set<Integer> setnum = new HashSet<>();
        setnum.add(4);
        setnum.add(2);
        setnum.add(4);
        setnum.add(10);

        System.out.println(setnum);

        // muốn duyệt set không dùng hàm get(I) để lấy phần tử
        // không dùng dk for(i)
        for (Integer obj: setnum) {
            System.out.println(obj);
        }

    }
}

