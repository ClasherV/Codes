import java.util.Scanner;

public class Sc2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age=sc.nextInt(); 
        System.out.print("Your Age is: "+age);
        sc.close();
    }
}

// O/p: Enter Your Age: 19
//      Your Age is: 19