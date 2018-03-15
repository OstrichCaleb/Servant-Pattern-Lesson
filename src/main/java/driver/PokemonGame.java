package driver;

import pokemon.Bulbasaur;
import pokemon.Charmander;
import pokemon.Pokemon;
import pokemon.Squirtle;

import java.util.Scanner;

public class PokemonGame
{
    private static Scanner reader;
    private static Pokemon pokemon;
    private static Boolean active;

    public static void main(String[] args)
    {
        active = true;
        reader = new Scanner(System.in);

        while (active)
        {
            createPokemon();
            pokemon.addMove("Growl");
            if (active)
            {
                pickAttackChoice();
            }
        }
        reader.close();
    }

    private static void pickAttackChoice()
    {
        askForAttackChoice();
        int choiceInt = getChoice() - 1;
        String pickedAttack = "";
        if (choiceInt < pokemon.getMoves().size() && choiceInt >= 0)
        {
            pickedAttack = pokemon.getMoves().get(choiceInt);
        }

        if (pickedAttack.equals("Growl"))
        {
            pokemon.growl();
        } else if (pickedAttack.equals(""))
        {
            createChoiceError();
        } else
        {
            pokemon.specialAttack();
        }
    }

    private static void askForAttackChoice()
    {
        System.out.println("Please pick an attack");
        int counter = 1;
        for (String attack : pokemon.getMoves())
        {
            System.out.println(attack + " - " + counter++);
        }
    }

    private static void createPokemon()
    {
        askForPokemonChoice();
        int choiceInt = getChoice();

        if (choiceInt == 1)
        {
            pokemon = new Squirtle();

        } else if (choiceInt == 2)
        {
            pokemon = new Charmander();
        } else if (choiceInt == 3)
        {
            pokemon = new Bulbasaur();
        } else if (choiceInt == 4)
        {
            active = false;
            System.out.println("Thanks for playing!");
        } else
        {
            createPokemonError();
        }
    }

    private static int getChoice()
    {
        String choiceString = reader.nextLine();
        int choiceInt = 0;

        try
        {
            choiceInt = Integer.parseInt(choiceString);
        } catch (NumberFormatException e)
        {
            System.out.println("Please enter a number listed");
        }

        return choiceInt;
    }

    private static void createPokemonError()
    {
        System.out.println("I'm sorry, that is not a valid choice. Please try again!");
        createPokemon();
    }

    private static void createChoiceError()
    {
        System.out.println("I'm sorry, that is not a valid choice. Please try again!");
        pickAttackChoice();
    }

    private static void askForPokemonChoice()
    {
        System.out.println("\nWhich pokemon would you like to create?");
        System.out.println("Squirtle - 1");
        System.out.println("Charmander - 2");
        System.out.println("Bulbasaur - 3");
        System.out.println("End game - 4");
    }
}
