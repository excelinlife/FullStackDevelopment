package excel.in.week1.day2;

public class Life {
    public static void main(String[] args) {

//byte -> short -> char -> int -> long -> float -> double

        System.out.println("Hello world");
        int num = 10;
        Integer integer = new Integer(10);
        //unboxing
        int newNum= integer;

        boolean b =false;
        //Boolean bool = new Boolean(true);
        Boolean bool = false;//autoboxing: automatically



        long value=1233222222;
        int value2= (int) value;



        char c = 'A';
        Character character = new Character('A');

        char c2= '1';
        char c3= '3';
        char c4 = '$';
        long big = 1202022020;
        Long lg = new Long(1234444343);

        float fl = 10.5f;
        String name = "Great Learning";
        boolean isTrue = false;
        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println(num);
        System.out.println(c);
        System.out.println(fl);
        System.out.println(name);
        System.out.println(isTrue);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(big);

    }
}
