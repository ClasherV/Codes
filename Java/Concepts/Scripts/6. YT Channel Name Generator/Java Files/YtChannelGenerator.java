import java.util.*;

public class YtChannelGenerator
{
    public static void main(String args[])
    {
        System.out.println("Welcome to YouTube Channel Name Generator!!"); 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Your Nick Name: "); 
        String name=sc.nextLine(); 
        System.out.print("Enter the Next Word You want to Add: "); 
        String next_word=sc.nextLine(); 
        System.out.println("Your YT Channel Name could be: " + name + " " + next_word);
        sc.close();
    }
}

// O/p: Enter Your Nick Name: Clasher
//      Enter the Next Word You want to Add: of the Games
//      Your YT Channel Name could be: Clasher of the Games