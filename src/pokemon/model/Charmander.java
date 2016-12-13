package pokemon.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander()
	{
		super("Charmander", 4);
	}
	
	public Charmander(String name)
	{
		super(name, 4);
	}
	
	public int Ember()
	{
		return 15;
	}
	
	public int FirePunch()
	{
		return this.getCombatPoints() * 10;
	}
}
