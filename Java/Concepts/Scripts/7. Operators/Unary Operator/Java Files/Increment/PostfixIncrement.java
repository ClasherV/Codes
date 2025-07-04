public class PostfixIncrement
{
    public static void main(String args[])
    {
        int a=10;
        int b=11;
        System.out.println("a: "+a+", b: "+b);
        b=a++;
        System.out.println("a: "+a+", b: "+b);
    }
}

// O/p: a: 10, b: 11
//      a: 11, b: 10