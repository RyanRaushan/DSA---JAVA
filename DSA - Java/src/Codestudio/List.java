package Codestudio;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(2);
        list.add(9);

        list.addAll(list);
        System.out.println(list);
    }
}