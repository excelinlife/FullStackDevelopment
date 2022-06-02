package excel.in.week2.day4;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(binary(arr, 2));
    }
    public static int linearSearch(int[] input, int num){
        //O(n), best = omega of (1), average theta of (n)
        for (int i = 0; i < input.length; i++) {
            if (input[i]==num){
                return i;
            }
        }
        return -1;
    }


    public static  int binary(int[] input ,int val){
        int st = 0;
        int end = input.length-1;
        while (st<end){
            int mid = st + (end-st)/2;
            if (input[mid]==val)
                return mid;
            else if (input[mid]>val){
                end = mid - 1;
            } else {
                st=mid+1;
            }
        }
        return -1;
    }
}
