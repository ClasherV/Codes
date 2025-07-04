import java.util.Scanner;

public class hasNextInt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        boolean isInt=sc.hasNextInt(); 
        System.out.print("The Number is an Integer is: "+isInt);
        sc.close();
    }
}

// O/p 1: Enter a Number: 19
//        The Number is an Integer is: true

// O/p 2: Enter a Number: A
//        The Number is an Integer is: false