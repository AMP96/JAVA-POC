package OOPs.inheritance;

public class Frog extends Animals
{
    private int legs;
    private String sound;

    public Frog() { }

    public Frog(int legs, String sound)
    {
        this.legs = legs;
        this.sound = sound;
    }

    public int getLegs() { return legs; }

    public String getSound() { return sound; }

    @Override
    public void foodConsumption() {  System.out.println("Carnivore. "); }

    @Override
    public void type(){System.out.println("Amphibian. ");}

}
