/* Q.3 Declare a variable of type int and assign a value 4567L and explain why are you getting this error?*/

public class Q3
{
    public static void main(String args[])
    {
        int a=(int)(4567L); //Due to L, the number became long so int can't store it, so we type cast it
        System.out.println("Number: "+a);
    }
}

// O/p: Number: 4567
