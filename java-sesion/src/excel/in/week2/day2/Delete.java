package excel.in.week2.day2;

public class Delete {
    public static void main(String[] args) {

        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        deleteMid(arr2, 2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }


    public static void deleteMid(int[] input, int pos){
        for (int i = pos; i <input.length ; i++) {
            input[i-1]=input[i];
        }
        input[input.length-1]=0;
    }

    public static void deleteBeg(int[] input) {
        for (int i = input.length; i < input.length; i++) {
            input[i - 1] = input[i];
        }
        input[input.length-1]=0;
    }

    public static void deleteEnd(int[] input){
        input[input.length-1]=0;
    }
}
