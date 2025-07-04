public class DatatypeLong
{
    public static void main(String[] args)
    {
        long a=1234567890123433L;
        long b=12345_678910_11121314L;
        long c=123456789123456789l;
        long min_value=Long.MIN_VALUE;
        long max_value=Long.MAX_VALUE;
        System.out.println("Value of a: "+a);
        System.out.println("Min Value of a: "+min_value);
        System.out.println("Max Value of a: "+max_value);
        System.out.println("Value of b: "+b);
        System.out.println("Value of c: "+c);
    }
}

// O/p: Value of a: 1234567890123433
//      Value of b: 1234567891011121314     
//      Value of c: 123456789123456789   
//      Max Value of Long: 9223372036854775807
//      Min Value of Long: -9223372036854775808