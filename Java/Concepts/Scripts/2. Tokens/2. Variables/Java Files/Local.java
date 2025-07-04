public class Local
{
    void display()
    {
        int a=10,b=5,c;
        c=15;
        int sum=a+b;
        System.out.println("Sum: "+sum);
        System.out.println("C: "+c);
    }
    public static void main(String[] args)
    {
        Local obj=new Local();
        int sum=50;
        System.out.println("Main Sum: "+sum);
        obj.display();
    }
}

// O/p: Main Sum: 50
//      Sum: 15
//      C: 15