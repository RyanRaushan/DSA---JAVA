package InterviewBit;

import java.util.ArrayList;

public class MoveZeroes {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(3);
        list.add(0);
        list.add(13);
        list.add(45);
       System.out.println(solve(list));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> a) {
        
        ArrayList <Integer> list = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < a.size(); i++){     
            if (a.get(i) != 0){
                list.add(a.get(i));
                j++;
            }
        }

        while (--j > 0){
            list.add(0);
        }
        return list;
    }
}
