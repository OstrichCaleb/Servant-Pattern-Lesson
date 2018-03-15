package pokemon;

public class Squirtle extends Pokemon
{
    public Squirtle()
    {
        super(44,48, 65, 50, 64, 43, "Water", "Squirtle");
        addMove("Water Gun");
        System.out.println("Squirtle Squirtle");
    }

    public void specialAttack()
    {
        System.out.println("Squirtle uses Water Gun for " + getSpecialAttack() + " damage!");
    }
}
