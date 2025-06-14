package Biodome3;

public class Plant extends Organism_3{
	String grow;
	String fruit;

	public Plant(String name, String species, String habitat, String grow, String fruit) 
	{
		super(name,species,habitat);
		this.grow = grow;
		this.fruit = fruit;
	}
	
	@Override
	void displayInfo()
	{
		System.out.print(name+" ," + species+" ," + habitat+" ," + grow+" ," + fruit);
	}
}
