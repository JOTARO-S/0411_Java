package jp.Test;

import java.util.ArrayList;

public class Test_0421 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        //偶数をfor文で出す
        for (Integer i : list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        //偶数をラムダ式で出す
        list.stream().filter(o -> o % 2 == 0)
                .forEach(o -> System.out.println(o));
    }
}

