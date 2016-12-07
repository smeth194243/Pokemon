package pokemon.controller;

import java.util.ArrayList;

public class PokemonController
{
	private ArrayList<Pokemon> pokedex;
	
	public void start()
	{
		
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Charmander("Fiery Lizard"));
		pokedex.add(new Charizard("Lava Dragon"));
		pokedex.add(new Butterfree("Big Butterfly"));
		pokedex.add(new Pidgey("Tweety Bird"));
		pokedex.add(new Caterpie("Swift Slug"));
		
		
		
	}
}
