/* Q.1 WAP to take input from user as length and breadth and calculate area of Rectangle.  
	Area of rectangle= Length * Breadth
*/
/* 
import java.util.*;

public class Assignment6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length of the Rectangle: ");
        float length=sc.nextFloat();
        System.out.print("Enter the Breadth of the Rectangle: ");
        float breadth=sc.nextFloat();
        float area=length*breadth;
        System.out.print("Area of the Rectangle is: "+area);
        sc.close();
    }
}

// O/p: Enter the Length of the Rectangle: 3.5
//      Enter the Breadth of the Rectangle: 4.5
//      Area of the Rectangle is: 15.75
*/

/* Q.2 WAP to take input from user as base and height and calculate Area of a triangle.
       Area of triangle = ½*base*height
*/
/* 
import java.util.*;

public class Assignment6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Base of the Triangle: ");
        float base=sc.nextFloat();
        System.out.print("Enter the Height of the Triangle: ");
        float height=sc.nextFloat();
        float area=(base*height)/2;
        System.out.print("Area of the Triangle is: "+area);
        sc.close();
    }
}

// O/p: Enter the Base of the Triangle: 3.2
//      Enter the Height of the Triangle: 4.3
//      Area of the Triangle is: 6.8800006
*/

/* Q.3 WAP to calculate Simple Interest. 
       Simple Interest= (principal amount*rate*time)/100
*/
/* 
import java.util.*;

public class Assignment6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        float principal_amount=sc.nextFloat();
        System.out.print("Enter the Rate of Interest: ");
        float rate_of_interest=sc.nextFloat();
        System.out.print("Enter the Time: ");
        float time=sc.nextFloat();
        float simple_interest=(principal_amount*rate_of_interest*time)/100;
        System.out.print("Simple Interest is: "+simple_interest);
        sc.close();
    }
}

// O/p: Enter the Principal Amount: 5000
//      Enter the Rate of Interest: 5.5
//      Enter the Time: 2
//      Simple Interest is: 550.0
*/

/* Q.4 WAP to calculate product of two floating point numbers */
/* 
import java.util.*;

public class Assignment6
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
*/

/* Q5 WAP to take input from user a byte value, short value, int value, long value, float value, double value, 
      Boolean value and print all these values. 
*/
/* 
import java.util.*;

public class Assignment6
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
*/