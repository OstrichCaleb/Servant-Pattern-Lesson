package pokemon;

public class Squirtle extends Pokemon
{
    public Squirtle()
    {
        String[] moves = {"Water Gun", "Growl"};
        System.out.println("Squirtle Squirtle!");
        setPokemonName("Squirtle");
        setType("Water");
        setMoves(moves);
        setHitPoints(44);
        setAtack(48);
        setDefense(65);
        setSpecialAttack(50);
        setSpecialDefense(64);
        setSpeed(43);
    }

    public void specialAttack()
    {
        System.out.println("Squirtle uses Water Gun for " + getSpecialAttack() + " damage!");
    }
}
