package biodome2;

public class BiodomeFamily02 {
	public static void main(String[] args)
	{
		LifeNest_2 Life = new LifeNest_2();
		Organism_2 x1 = new Organism_2("펭귄","동물","남극");
		Organism_2 x2 = new Organism_2("코알라","동물","호주");
		Organism_2 x3 = new Organism_2("선인장","식물","사막");
		Organism_2 x4 = new Organism_2("페퍼민트","식물","정원");
		
		Life.add(x1);
		Life.add(x2);
		Life.add(x3);
		Life.add(x4);
		
		Life.print_all();
		
		Life.delete("코알라");
		Life.delete("선인장");
	
		Life.set("펭귄","남극");
		
		
		Life.print_all();
	}
}
