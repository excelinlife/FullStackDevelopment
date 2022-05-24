package excel.in;

public class Casting2
{
    public static void main(String args[])
    {
        double d = 166.6;

//converting double data type into long data type
        long l = (long)d;
//converting long data type into int data type
        int i = (int)l;
        System.out.println("Before conversion: "+d);
//fractional part lost
        System.out.println("After conversion into long type: "+l);
//fractional part lost
        System.out.println("After conversion into int type: "+i);
    }
}