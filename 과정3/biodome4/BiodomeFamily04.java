package biodome4;

public class BiodomeFamily04 {
	public static void main(String[ ]args)
	{
		SunLight kind1 = new SunLight();
		WindPower kind2 = new WindPower();
		GeothermalHeat kind3 = new GeothermalHeat();
		
		kind1.produceEnergy(5);
		kind2.produceEnergy(12);
		kind3.produceEnergy(4);
		System.out.println();
		
		kind1.useEnergy(30);
		kind2.useEnergy(30);
		kind3.useEnergy(30);
		System.out.println();
		
		EnergyManager manager = new EnergyManager();
		int allEnergy = manager.mergeEnergy(kind1,kind2,kind3);
		
		System.out.println("남은 에너지: "+allEnergy);
		
	}
}
