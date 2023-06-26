package demo.polymorphism.compiletime;

public class Bike implements Vehicle
{
    @Override
    public void speedAndWheels() { System.out.println("Bike runs at an average speed of 60 km/h and has 2 wheels."); }
}
