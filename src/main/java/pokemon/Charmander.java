package pokemon;

public class Charmander extends Pokemon
{
    public Charmander()
    {
        String[] moves = {"Ember", "Growl"};
        System.out.println("Charmander!!!");
        setPokemonName("Charmander");
        setType("Fire");
        setMoves(moves);
        setHitPoints(39);
        setAtack(52);
        setDefense(43);
        setSpecialAttack(60);
        setSpecialDefense(50);
        setSpeed(65);
    }

    public void specialAttack()
    {
        System.out.println("Charmander uses Ember for " + getSpecialAttack() + " damage!");
    }
}
