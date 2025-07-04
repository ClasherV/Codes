/* Q.1 WAP to take input from user as length and breadth and calculate area of Rectangle.  
	Area of rectangle= Length * Breadth
*/

import java.util.*;

public class Q1
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