/* Q.5 What happens if you try to store the above sum in int variable. 
       Is there any error? 
       If yes then explain why this error and fix the error. 
*/

public class Q5
{
    public static void main(String[] args)
    {
        int a=100;
        long b=200;
        int sum=(int)(a+b);
        System.out.println("Sum: "+sum);
    }
}

// O/p: Sum: 300
