import java.util.Scanner;

public class Sc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name=sc.next(); //Delimitier---> Space or Tab
        System.out.print("Your Name is: "+name);
        sc.close();
    }
}

// O/p: Enter Your Name: Vaibhav Raikwar
//      Your Name is: Vaibhav