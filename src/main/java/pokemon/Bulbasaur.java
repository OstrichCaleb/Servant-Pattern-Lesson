package pokemon;

public class Bulbasaur extends Pokemon
{
    public Bulbasaur()
    {
        String[] moves = {"Vine Whip", "Growl"};
        System.out.println("Buuuuuulbasaur!");
        setPokemonName("Bulbasaur");
        setType("Grass");
        setMoves(moves);
        setHitPoints(45);
        setAtack(49);
        setDefense(49);
        setSpecialAttack(65);
        setSpecialDefense(65);
        setSpeed(45);
    }

    public void specialAttack()
    {
        System.out.println("Bublasaur uses Vine Whip for " + getSpecialAttack() + " damage!");
    }
}
