package pokemon;

import java.util.ArrayList;

public abstract class Pokemon
{
    private ArrayList<String> moves;
    private int hitPoints;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private String type;
    private String pokemonName;

    public Pokemon(int hitPoints, int attack, int defense, int specialAttack, int specialDefense, int speed, String type, String pokemonName)
    {
        this.moves = new ArrayList<>();
        this.hitPoints = hitPoints;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.type = type;
        this.pokemonName = pokemonName;
    }

    public String getPokemonName()
    {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName)
    {
        this.pokemonName = pokemonName;
    }

    public ArrayList<String> getMoves()
    {
        return moves;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }

    public int getAttack()
    {
        return attack;
    }

    public void setAttack(int attack)
    {
        this.attack = attack;
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

    public void addMove(String move)
    {
        this.moves.add(move);
    }

    public abstract void specialAttack();
}
