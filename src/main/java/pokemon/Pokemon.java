package pokemon;

public abstract class Pokemon
{
    private String[] moves;
    private int hitPoints;
    private int atack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private String type;
    private String pokemonName;

    public String getPokemonName()
    {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName)
    {
        this.pokemonName = pokemonName;
    }

    public String[] getMoves()
    {
        return moves;
    }

    public void setMoves(String[] moves)
    {
        this.moves = moves;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }

    public int getAtack()
    {
        return atack;
    }

    public void setAtack(int atack)
    {
        this.atack = atack;
    }

    public int getDefense()
    {
        return defense;
    }

    public void setDefense(int defense)
    {
        this.defense = defense;
    }

    public int getSpecialAttack()
    {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack)
    {
        this.specialAttack = specialAttack;
    }

    public int getSpecialDefense()
    {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense)
    {
        this.specialDefense = specialDefense;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void growl()
    {
        System.out.println("Your " + pokemonName + " growled!");
    }

    public abstract void specialAttack();
}
