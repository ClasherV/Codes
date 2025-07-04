/* Q.3 WAP to calculate Simple Interest. 
       Simple Interest= (principal amount*rate*time)/100
*/

import java.util.*;

public class Q3
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