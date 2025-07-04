import java.util.Scanner;

public class Sc3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Height(in cm): ");
        float height=sc.nextFloat(); 
        System.out.print("Your Height is: "+height);
        sc.close();
    }
}

// O/p: Enter Your Height(in cm): 65.6
//      Your Height is: 65.6