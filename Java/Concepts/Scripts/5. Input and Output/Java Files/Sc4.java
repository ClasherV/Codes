import java.util.Scanner;

public class Sc4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Num1: ");
        byte num1=sc.nextByte();
        System.out.print("Enter the Num2: ");
        byte num2=sc.nextByte();
        byte sum=(byte)(num1+num2);
        System.out.print("Sum is: "+sum);
        sc.close();
    }
}

// O/p: Enter the Num1: 128
//      Exception in thread "main" java.util.InputMismatchException: Value out of range. Value:"128" Radix:10
//              at java.base/java.util.Scanner.nextByte(Scanner.java:2017)
//              at java.base/java.util.Scanner.nextByte(Scanner.java:1965)
//              at Sc4.main(Sc4.java:9)