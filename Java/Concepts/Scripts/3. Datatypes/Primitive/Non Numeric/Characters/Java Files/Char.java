public class Char
{
    public static void main(String args[])
    {
        char a='A';
        char b='1';
        char c=65;
        char d='\u0041';
        int e=Character.MAX_VALUE;
        int f=Character.MIN_VALUE;
        char g=(char)(e+40);
        char h=(char)(f-40000);
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        System.out.println("e: "+e);
        System.out.println("f: "+f);
        System.out.println("g: "+g);
        System.out.println("h: "+h);
    }
}

// O/p: a: A
//      b: 1
//      c: A
//      d: A
//      e: 65535
//      f: 0
//      g: '
//      h: ?