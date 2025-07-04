class StudentInfo
{
    String name;
    int rollNo;
    int age;

    void display()
    {
        System.out.println("The Student "+name+" has Roll Number: "+rollNo);
    }
}
public class StudentMain
{
    public static void main(String[] args)
    {
        StudentInfo obj = new StudentInfo();
        obj.name="Vaibhav";
        obj.rollNo=48;
        obj.age=19;
        obj.display();
    }
}

// O/p: The Student Vaibhav has Roll Number: 48