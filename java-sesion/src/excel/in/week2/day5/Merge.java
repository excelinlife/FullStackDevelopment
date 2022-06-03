package excel.in.week2.day5;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {10,6,8,5,7,3,4};
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int[] input, int left, int right){
        if (left<right){
            int mid = left+(right-left)/2;
            mergeSort(input, left, mid);
            mergeSort(input, mid+1, right);
            sort(input, left, mid, right);
        }
    }

    public static void sort(int[] input, int beg, int mid, int end){
        int len1 = mid-beg+1;
        int len2= end-mid;
        int[] left = new int[len1];
        int[] right = new int[len2];
        for (int i = 0; i < len1; i++) {
            left[i]= input[beg+1];
        }

        for (int j = 0; j < len2; j++) {
            right[j]= input[mid+j+1];
        }
        int i=0,j=0, k=beg;
        while (i<len1 && j<len2){
            if (left[i]<=right[j]){
                input[k]=left[i];
                i++;
            } else {
                input[k]=right[j];
                j++;
            }
            k++;
        }

        while (i<len1){
            input[k]=left[i];
            k++;i++;
        }

        while (j<len2){
            input[k]=right[j];
            k++;j++;
        }
    }
}
