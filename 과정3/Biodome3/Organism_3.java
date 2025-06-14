package Biodome3;

public class Organism_3 {
	String name;
	String species; 
	String habitat;
	
	public Organism_3(String name, String species, String habitat)
	{
		this.name = name;
		this.habitat = habitat;
		this.species = species;
	}
	
	void displayInfo()
	{
		System.out.print(name + species + habitat);
	}
}
