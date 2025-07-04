/* Q.1 WAP to print following pattern without println(). 
       Use System.out.print().  
       [Hint: you can use escape sequence)

1.  *                              2.         *
    * *                                     * *
    * * *						          * * * 
    * *                                     * *
    *                                         *
*/
/* 
public class Assignment5
{
    public static void main(String args[])
    {
        System.out.print("*\n");
        System.out.print("**\n");
        System.out.print("***\n");
        System.out.print("**\n");
        System.out.print("*\n");
    }
}

// O/p: *
//      ** 
//      ***
//      ** 
//      * 
*/

/* Q.1 WAP to print following pattern without println(). 
       Use System.out.print().  
       [Hint: you can use escape sequence)

1.  *                              2.         *
    * *                                     * *
    * * *						          * * * 
    * *                                     * *
    *                                         *
*/
/* 
public class Assignment5
{
    public static void main(String args[])
    {
        System.out.print("  *\n");
        System.out.print(" **\n");
        System.out.print("***\n");
        System.out.print(" **\n");
        System.out.print("  *\n");
    }
}

// O/p:   *
//       **
//      ***
//       **
//        *
*/

/* Q.2 WAP to convert inches to Foot. (Given is 61.8 inches) */
/* 
public class Assignment5
{
    public static void main(String args[])
    {
        float inches=61.8F;
        float foot=inches/12;
        System.out.print(inches+" Inches to Foot is: "+foot+" Foot");
    }
}

// O/p: 61.8 Inches to Foot is: 5.15 Foot
*/

/* Q.3 WAP to print following Heart pattern.
       [Hint: use only multiple System.out.println() statements and use Unicode sequence for heart symbol] 

  ❤  ❤  ❤     ❤  ❤  ❤
 
 ❤          ❤          ❤
 
  ❤                    ❤
 
      ❤             ❤
 
         ❤       ❤
 
             ❤
*/
/* 
public class Assignment5
{
    public static void main(String args[])
    {
        System.out.println("  \u2764  \u2764  \u2764     \u2764  \u2764  \u2764\n");
        System.out.println("\u2764          \u2764          \u2764\n");
        System.out.println("  \u2764                 \u2764\n");
        System.out.println("     \u2764           \u2764\n");
        System.out.println("        \u2764     \u2764\n");
        System.out.println("           \u2764");
    }
}

// O/p:   ❤  ❤  ❤     ❤  ❤  ❤
//       
//       ❤          ❤          ❤
//       
//        ❤                    ❤
//       
//            ❤             ❤
//       
//               ❤       ❤
//       
//                   ❤
*/