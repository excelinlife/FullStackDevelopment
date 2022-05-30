package excel.in.week2.day1;

public class Recursion {
    public static void main(String[] args) {
        //print(5);
        System.out.println(factorial(5));
        System.out.println(recursiveFact(6));
        System.out.println(fib(10));
        System.out.println(recSum(10));
    }

    static int fib(int n){
        if (n==0 || n== 1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    static int recursiveFact(int n){
        if (n<=1)
            return n;
        return n*recursiveFact(n-1);
    }

    static int factorial(int n){
        int result =1;
        for (int i = 1; i <= n; i++) {
            result=result*i;
        }
        return result;
    }

    static void print(int n){
        if (n<1)
            return;
        System.out.println(n);
        print(n-1);
    }

    static int recSum(int n){
        if (n==1)
            return 1;
        return n+recSum(n-1);
    }
    static int sum(int n){
        int res = 0;
        for (int i = 1; i <=n; i++) {
            res+=i;
        }
        return res;
    }
}