package pokemon.controller;

import java.util.ArrayList;
import pokemon.model.*;
import pokemon.view.PokemonFrame;
import javax.swing.JOptionPane;

public class PokemonController
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	
	public void PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		baseFrame = new PokemonFrame(this);
	}
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to the Pokemon interface!");
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Charmander("Fiery Lizard"));
		pokedex.add(new Charizard("Lava Dragon"));
		pokedex.add(new Butterfree("Big Butterfly"));
		pokedex.add(new Pidgey("Tweety Bird"));
		pokedex.add(new Caterpie("Swift Slug"));
		
	} 
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames = new String[pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
		return pokemonNames;
		
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		this.name = name;
	}
}
