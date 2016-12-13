package pokemon.model;

public class Pidgey extends Pokemon implements Flying
{
	public Pidgey()
	{
		super("Pidgey", 16);
	}
	
	public Pidgey(String name)
	{
		super(name, 16);
	}
	
	public int Fly()
	{
		return 0;
	}
	
	public int AirSlice()
	{
		return 20;
	}
}
