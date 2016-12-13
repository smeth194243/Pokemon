package pokemon.model;

public class Caterpie extends Pokemon implements Bug
{
	public Caterpie()
	{
		super("Caterpie", 10);
	}
	
	public Caterpie(String name)
	{
		super(name, 10);
	}
	
	public int LeechSeed()
	{
		return 250;
	}
	
	public int String()
	{
		return 50;
	}
}
