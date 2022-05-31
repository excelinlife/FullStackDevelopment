package excel.in.week2.day2;

public class Update {
    public static void main(String[] args) {
        //1 2 3 4 5 -> 1 2 9 4 5;
    }

    public static void update(int[] input, int pos, int val){
        input[pos-1]=val;
    }
}
