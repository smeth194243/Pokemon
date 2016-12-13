package pokemon.model;

public class Charizard extends Pokemon implements Fire, Flying
{
	public Charizard()
	{
		super("Charizard", 6);
	}
	
	public Charizard(String name)
	{
		super(name, 6);
	}
	
	public int Ember()
	{
		return 45;
	}
	
	public int FirePunch()
	{
		return this.getCombatPoints() * 10;
	}
	
	
	
}
