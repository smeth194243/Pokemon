package pokemon.model;

public class Butterfree extends Pokemon implements Flying, Bug 
{
	public Butterfree()
	{
		super("Butterfree", 12);
	}
	
	public Butterfree(String name)
	{
		super(name, 12);
	}
	
	public int Fly()
	{
		return 0;
	}
	
	public int AirSlice()
	{
		return 100;		
	}
	
	public int LeechSeed()
	{
		return 500;
		//make it actually sap?
	}
	
	public int String()
	{
		return 50;
		//make it disable pokemon?
	}
}
