package pokemon;

public class Charmander extends Pokemon
{
    public Charmander()
    {
        super(39,52, 43, 60, 50, 65, "Fire", "Charmander");
        addMove("Ember");
        System.out.println("Charmander!!!");
    }

    public void specialAttack()
    {
        System.out.println("Charmander uses Ember for " + getSpecialAttack() + " damage!");
    }
}
