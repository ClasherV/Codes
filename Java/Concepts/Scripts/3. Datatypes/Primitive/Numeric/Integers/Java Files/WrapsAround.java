public class WrapsAround
{
    public static void main(String args[])
    {
        int max_value=Integer.MAX_VALUE;
        int min_value=Integer.MIN_VALUE;
        int wrap1=max_value+1;
        int wrap2=min_value-1;
        System.out.println("Max Value of Integer: "+max_value);
        System.out.println("Max Value + 1: "+wrap1);
        System.out.println("Min Value of Integer: "+min_value);
        System.out.println("Min Value - 1: "+wrap2);
    }
}

// O/p: Max Value of Integer: 2147483647
//      Max Value + 10: -2147483648      
//      Min Value of Integer: -2147483648
//      Min Value - 10: 2147483647 