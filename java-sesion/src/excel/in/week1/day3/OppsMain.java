package excel.in.week1.day3;

public class OppsMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Dhoni", 21, true);
        System.out.println(manager.name);

        OppsMain oppsMain = new OppsMain();
        oppsMain.name("Dhoni");
        oppsMain.name("kohli", "Raina");

    }

    public void name(String name){
        System.out.println(name);
    }

    public void name(String name1, String name2){
        System.out.println(name1+" "+name2);
    }


    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
