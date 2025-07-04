public class Float
{
    public static void main(String args[])
    {
        float a=98;
        float b=98.0F;
        float c=98.9f;
        float d=(float)(98.9); //By default it is double
        float e=1.66666666666666666666666666666666666666f;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        System.out.println("e: "+e);
    }
}

// O/p: a: 98.0
//      b: 98.0
//      c: 98.9
//      d: 98.9
//      e: 1.6666666