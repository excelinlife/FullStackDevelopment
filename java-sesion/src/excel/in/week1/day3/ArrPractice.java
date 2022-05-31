package excel.in.week1.day3;

public class ArrPractice {
    public static void main(String[] args) {
        String[] names =new String[3];
        String[] list={"ddsd","ffdfd","fvvv"};

    /*    for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }*/

        for (String a:list){
            System.out.println(a);
        }
        int i=0;
        while (i<list.length){
            System.out.println(list[i]);
            i++;
        }
        char[] chars = {'a','s','h','i','s','h'};
        String s = "ashish";
        String s1 = new String("ashish");
        String name =new String(chars);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(name);


        StringBuffer sb =new StringBuffer("ashish");
        StringBuilder sbd= new StringBuilder("ashish");
    }
}
