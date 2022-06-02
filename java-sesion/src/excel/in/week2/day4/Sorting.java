package excel.in.week2.day4;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        selection(arr);
        printArr(arr);
    }

    public static void printArr(int[] input){
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
    }

    public static void bubble(int[] input){
        int len = input.length;
        for (int i = 0; i <len-1 ; i++) {
            for (int j = 0; j < len-1; j++) {
                if (input[j]>input[j+1]){
                    int temp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
    }

    public static void insertion(int[] input){
        int len=input.length;
        for (int i = 1; i < len; i++) {
            int val=input[i];
            int j=i-1;
            while (j>=0 && input[j]>val){
                input[j+1]=input[j];
                j--;
            }
            input[j+1]=val;
        }
    }

    public static void selection(int[] input){
        int len=input.length;
        for (int i = 0; i < len-1; i++) {
            int min=i;
            for (int j = i+1; j < len; j++) {
                if (input[j]<input[min]){
                    min=j;
                }
            }
            int temp = input[min];
            input[min]=input[i];
            input[i]=temp;
        }
    }
}
