/* Q.2 WAP to take input from user as base and height and calculate Area of a triangle.
       Area of triangle = ½*base*height
*/

import java.util.*;

public class Q2
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