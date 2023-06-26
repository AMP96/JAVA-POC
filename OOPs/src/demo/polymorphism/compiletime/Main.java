package demo.polymorphism.compiletime;

public class Main
{
    public static void main(String[] args)
    {
    Vehicle b = new Bike();
    Vehicle c = new Car();
    Car a= new Auto();

        System.out.println("Info on Bike:");
        b.speedAndWheels();

        System.out.println("\nInfo on Car:");
        c.speedAndWheels();

        System.out.println("\nInfo on Auto:");
        a.speedAndWheels();
    }
}
