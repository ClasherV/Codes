import java.io.IOException;

public class In
{
    public static void main(String args[]) throws IOException{
        System.out.print("Enter Your Age: ");
        int x=System.in.read(); //Reads ASCII and one char at a time ---> 1-->49
        System.out.print("Your Age is: "+x);
    }
}

// O/p: Enter Your Age: 19
//      Your Age is: 49 