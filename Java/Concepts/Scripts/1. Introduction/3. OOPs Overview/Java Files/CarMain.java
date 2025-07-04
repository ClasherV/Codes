public class CarMain 
{
    public static void main(String[] args)
    {
        Car BMW=new Car();
        Car Audi=new Car();
        BMW.model="M4";
        Audi.model="Q5";
        BMW.color="Navy Blue";
        Audi.color="Black";
        BMW.year=2023;
        Audi.year=2020;
        BMW.display();
        System.out.println();
        Audi.display();
        System.out.println();
        BMW.getSpeed();
        Audi.getSpeed();
        System.out.println();
        BMW.accelerate();
        Audi.accelerate();
        System.out.println();
        BMW.brake();
        Audi.brake();
    }
}
class Car
{
    int year;
    String color;
    String model;

    void accelerate()
    {
        System.out.println("Acceleration in 1 Minute is: 0.6 m/s^2 ");
    }
    void brake()
    {
        System.out.println("Brakes are applied");
    }
    void getSpeed()
    {
        System.out.println("Speed of the Car is: 130 kmph");
    }
    void display()
    {
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Year: "+year);
    }
}

// O/p: Model: M4
//      Color: Navy Blue
//      Year: 2023
//      
//      Model: Q5
//      Color: Black
//      Year: 2020
//      
//      Speed of the Car is: 130 kmph
//      Speed of the Car is: 130 kmph
//      
//      Acceleration in 1 Minute is: 0.6 m/s^2
//      Acceleration in 1 Minute is: 0.6 m/s^2
//      
//      Brakes are applied
//      Brakes are applied