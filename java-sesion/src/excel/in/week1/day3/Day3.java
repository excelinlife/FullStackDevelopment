package excel.in.week1.day3;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
      //  Employee kishan = new Employee("Kishan", 22, true);
      //  Employee devika = new Employee("Devika", 22, true);

        Employee kishan = new Employee();
        System.out.println(kishan.name);
        kishan.setName("Kishan");
        System.out.println(kishan.name);

        System.out.println("Please give input...");
        Scanner sc = new Scanner(System.in);
        /*String input1 = sc.next();
        String input2 = sc.next();
        String input3 = sc.next();
        String input4 = sc.next();
*/

      /*  String input = sc.nextLine();
*/
        System.out.println("how many numbers you want to give");
        int length = Integer.parseInt(sc.next());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("input "+(i+1)+"th number");
            arr[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        boolean b = sc.nextBoolean();
        System.out.println(b);

    }
}
