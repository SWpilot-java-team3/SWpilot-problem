package biodome2;

public class LifeNest_2 {
	Organism_2[] organismList = new Organism_2[100];
	int num;
	
	public LifeNest_2()
	{
		num = 0;
	}
	
	void add(Organism_2 x)
	{
		organismList[num] = x;
		num++;
		System.out.println("[LifeNest]: " + x.getName() + "이 추가되었습니다.");
	}
	
	void delete(String name)
	{
		for(int i=0;i<num;i++)
		{
			if(organismList[i] != null && organismList[i].getName().equals(name))
			{
				organismList[i] = null; 
			}
		}

		System.out.println("[LifeNest]: " + name + "이 삭제되었습니다.");
	}
	
	void set(String name, String habitat)
	{
		for(int i=0;i<num;i++)
		{
			if(organismList[i] != null && organismList[i].getName().equals(name))
			{
				organismList[i].setter(habitat);
			}
		}

		System.out.println("[LifeNest]: " + name + "서식지가 변경되었습니다.");
	}
	
	void print_all()
	{
		int index = 1;
		for(int i=0;i<num;i++)
		{
			if(organismList[i]!=null)
			{
				System.out.print(index+". ");
				organismList[i].displayInfo();
				index++;
				System.out.println();
			}
		}
	}
}
