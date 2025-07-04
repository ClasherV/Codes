/* Q.1 Declare a variable of type byte and assign a value 45 to it. 
       Declare another variable of type short and assign a value 12345 to it.
       Now add these two variables and print sum.
*/
/*
public class Assignment4
{
    public static void main(String args[])
    {
        byte a=45;
        short b=12345;
        System.out.println("Sum: "+(a+b));
    }
}

// O/p: Sum: 12390
*/

/* Q.2 Now what happen if you try to store the above sum in a byte variable? 
       Is there any error? 
       If yes, then explain why this error and fix this error. 
*/
/* 
public class Assignment4
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
*/

/* Q.3 Declare a variable of type int and assign a value 4567L and explain why are you getting this error?*/
/*
public class Assignment4
{
    public static void main(String args[])
    {
        int a=(int)(4567L); //Due to L, the number became long so int can't store it, so we type cast it
        System.out.println("Number: "+a);
    }
}

// O/p: Number: 4567
*/

/* Q.4 Declare a variable of type int and assign 100 to it. 
       Declare another variable of type long and assign a value 200 to it. 
       Now add these two numbers and print sum. 
*/
/* 
public class Assignment4
{
    public static void main(String[] args)
    {
        int a=100;
        long b=200;
        System.out.println("Sum: "+(a+b));
    }
}

// O/p: Sum: 300
*/

/* Q.5 What happens if you try to store the above sum in int variable. 
       Is there any error? 
       If yes then explain why this error and fix the error. 
*/
/* 
public class Assignment4
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
*/