package biodome2;

public class Organism_2 {
	private String name;
	private String species; 
	private String habitat;
	
	public Organism_2(String name, String species, String habitat)
	{
		this.name = name;
		this.habitat = habitat;
		this.species = species;
	}
	
	void displayInfo()
	{
		System.out.print(name +", "+ species +", "+ habitat);
	}
	
	String getName()
	{
		return this.name;
	}
	
	String getHabitat()
	{
		return this.habitat;
	}
	
	String getSpecies()
	{
		return this.species;
	}
	
	void setter(String habitat)
	{
		this.habitat = habitat;
	}
}

