package excel.in.week2.day2;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length-1; i++) {
            arr2[i]=i+1;
        }
        //1,2,3,4-> 0 1 2 3 4
        //1 2 3 4 0
        //1 2 0 3 4
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=arr2[i]*arr2[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        List<String> names = new ArrayList<>();
        names.add("Vinay");
        names.add("Harshita");
        names.add("Neeraja");
        names.add("Chetan");

        for (String name:names){
            System.out.println(name);
        }
    }
}



//traversing
//insert:
//delete:
//update:


