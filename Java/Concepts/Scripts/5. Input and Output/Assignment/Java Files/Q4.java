/* Q.4 WAP to calculate product of two floating point numbers */

import java.util.*;

public class Q4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Floating Point Number 1: ");
        float num1=sc.nextFloat();
        System.out.print("Enter the Floating Point Number 2: ");
        float num2=sc.nextFloat();
        float product=num1*num2;
        System.out.print("Product: "+product);
        sc.close();
    }
}

// O/p: Enter the Floating Point Number 1: 5.5
//      Enter the Floating Point Number 2: 2.3
//      Product: 12.65