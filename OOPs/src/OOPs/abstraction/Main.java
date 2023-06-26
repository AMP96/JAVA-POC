package OOPs.abstraction;

public class Main
{
    public static void main(String[] args)
    {
        Human m = new Man();
        System.out.println("Characteristics of a man:");
        m.gender();
        m.tone();
        m.sleep();

        System.out.println();

        System.out.println("Characteristics of a woman:");
        Woman w = new Woman();
        w.gender();
        w.tone();
        w.sleep();
    }
}