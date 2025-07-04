public class Double
{
    public static void main(String args[])
    {
        double a=98;
        double b=98.0D;
        double c=98.9d;
        double d=1.7e308;
        double e=0.0000000000000000000000000000000014;
        double f=1.6666666666666666666666666666666666666666666666666666666666d;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        System.out.println("e: "+e);
        System.out.println("f: "+f);
    }
}

// O/p: a: 98.0
//      b: 98.0
//      c: 98.9
//      d: 1.7E308
//      e: 1.4E-33
//      f: 1.6666666666666667