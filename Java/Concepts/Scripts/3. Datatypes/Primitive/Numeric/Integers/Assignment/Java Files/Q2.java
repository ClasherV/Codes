/* Q.2 Now what happen if you try to store the above sum in a byte variable? 
       Is there any error? 
       If yes, then explain why this error and fix this error. 
*/

public class Q2
{
    public static void main(String args[])
    {
        byte a=45;
        short b=12345;
        byte sum=(byte)(a+b);    //After the sum, the value became of type int so we type casted it to byte
        System.out.println("Sum: "+sum);
    }
}

// Sum: 102
