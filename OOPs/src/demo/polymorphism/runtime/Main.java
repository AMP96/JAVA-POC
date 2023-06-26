package demo.polymorphism.runtime;

public class Main
{
    public static void main(String[] args)
    {
        Numbers num = new Numbers();
        System.out.println("Adding two integers: " + num.addNum(10,20));

        System.out.println("\nAdding three integers: " + num.addNum(10,20,30));

        System.out.println("\nAdding two double values: " + num.addNum(50.0, 30.0));

        System.out.println("\nAdding two float values: " + num.addNum(50.5f, 30.5f));
    }
}
