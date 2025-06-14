package Biodome3;

public class Animal extends Organism_3
{
	String eat;
	String feed;

	public Animal(String name, String species, String habitat, String eat, String feed) 
	{
		super(name,species,habitat);
		this.eat = eat;
		this.feed = feed;
	}
	
	@Override
	void displayInfo()
	{
		System.out.print(name+", " + species +", "+ habitat+", " + eat +", "+ feed);
	}
}
