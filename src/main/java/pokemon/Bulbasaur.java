package pokemon;

public class Bulbasaur extends Pokemon
{
    public Bulbasaur()
    {
        super(45,49, 49, 65, 65, 45, "Grass", "Bulbasaur");
        addMove("Vine Whip");
        System.out.println("Buuuuuulbasaur!");
    }

    public void specialAttack()
    {
        System.out.println("Bublasaur uses Vine Whip for " + getSpecialAttack() + " damage!");
    }
}
