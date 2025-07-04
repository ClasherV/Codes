/* Q5 WAP to take input from user a byte value, short value, int value, long value, float value, double value, 
      Boolean value and print all these values. 
*/

import java.util.*;

public class Q5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Byte Value: ");
        byte byte_value=sc.nextByte();
        System.out.print("Enter a Short Value: ");
        short short_value=sc.nextShort();
        System.out.print("Enter an Int Value: ");
        int int_value=sc.nextInt();
        System.out.print("Enter a Long Value: ");
        long long_value=sc.nextLong();
        System.out.print("Enter a Float Value: ");
        float float_value=sc.nextFloat();
        System.out.print("Enter a Double Value: ");
        double double_value=sc.nextDouble();
        System.out.print("Enter a Boolean Value: ");
        boolean boolean_value=sc.nextBoolean();
        System.out.println("\nByte: "+byte_value);
        System.out.println("Short: "+short_value);
        System.out.println("Int: "+int_value);
        System.out.println("Long: "+long_value);
        System.out.println("Float: "+float_value);
        System.out.println("Double: "+double_value);
        System.out.println("Boolean: "+boolean_value);
        sc.close();
    }
}

// O/p: Enter a Byte Value: 120
//      Enter a Short Value: 30000
//      Enter an Int Value: 2147483
//      Enter a Long Value: 2147483654898
//      Enter a Float Value: 12.5555555
//      Enter a Double Value: 12.5555555555555555555
//      Enter a Boolean Value: true
//      
//      Byte: 120
//      Short: 30000
//      Int: 2147483
//      Long: 2147483654898
//      Float: 12.555555
//      Double: 12.555555555555555
//      Boolean: true