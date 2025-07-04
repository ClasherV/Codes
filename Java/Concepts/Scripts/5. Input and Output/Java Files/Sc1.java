import java.util.Scanner;

public class Sc1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name=sc.nextLine(); //Delimiter ---> Enter or New line
        System.out.print("Your Name is: "+name);
        sc.close();
    }
}

// O/p: Enter Your Name: Vaibhav Raikwar
//      Your Name is: Vaibhav Raikwar