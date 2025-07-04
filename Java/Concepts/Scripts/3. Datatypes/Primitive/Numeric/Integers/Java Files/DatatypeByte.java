public class DatatypeByte
{
    public static void main(String[] args)
    {
        byte a=50;
        byte min_value=Byte.MIN_VALUE;
        byte max_value=Byte.MAX_VALUE;
        // byte b=max_value+1; Error since the + will make the operands int 
        // and the compiler will not downcast it to byte to prevent data loss
        // same for short
        // It can upcast automatically but not downcast ----> Implicit conversion
        // Type Casting is the Explicit Conversion
        //Int to long not happens
        byte b=(byte)(max_value+1);
        System.out.println("Value of a: "+a);
        System.out.println("Min Value of a: "+min_value);
        System.out.println("Max Value of a: "+max_value);
        System.out.println("Converted b: "+b);
    }
}

// O/p: Value of a: 50
//      Min Value of Byte: -128
//      Max Value of Byte: 127
//      Converted b: -128