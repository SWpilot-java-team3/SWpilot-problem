package Biodome3;


public class BiodomeFamily03 {
	public static void main(String[] args)
	{
		LifeNest_3 Life = new LifeNest_3();
		Animal x1 = new Animal("펭귄","동물","남극","육식","물고기");
		Animal x2 = new Animal("코알라","동물","호주","초식","유칼립투스");
		Plant x3 = new Plant("선인장","식물","사막","11월","열매 있음");
		Plant x4 = new Plant("페퍼민트","식물","정원","7월","열매 없음");
		
		Life.add(x1);
		Life.add(x2);
		Life.add(x3);
		Life.add(x4);
		
		Life.print_all();
		
		Life.delete("코알라");
		Life.delete("선인장");
		
		Life.print_all();
	}
}
