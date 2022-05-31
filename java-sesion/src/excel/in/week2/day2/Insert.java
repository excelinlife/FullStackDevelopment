package excel.in.week2.day2;

public class Insert {
    public static void main(String[] args) {
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length-1; i++) {
            arr2[i]=i+1;
        }
        //1,2,3,4-> 0 1 2 3 4
        //1 2 3 4 0
        //1 2 0 3 4
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
      //  insertAtBeg(arr2, 0);
      /*  for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }*/

        insertAtPos(arr2, 10, 2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public static void insertAtBeg(int[] input, int val){
        for (int i = input.length-1; i > 0; i--) {
            input[i]=input[i-1];
        }
        input[0]=val;
    }

    public static void insertAtEnd(int[] input, int val){
        input[input.length-1]=val;
    }

    public static void insertAtPos(int[] input, int val, int pos){
        for (int i = input.length-1; i > pos; i--) {
            input[i]=input[i-1];
        }
        input[pos]=val;
    }
}
