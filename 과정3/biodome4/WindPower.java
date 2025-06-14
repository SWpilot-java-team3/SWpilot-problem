package biodome4;

public class WindPower extends EnergySource {

	public WindPower() 
	{
		super("풍력 에너지");
		this.energyAmount = 0; 
	}
	
	@Override
	void useEnergy(int use) 
	{
		this.energyAmount -= use; 
		System.out.printf("%s 를 %d 사용했습니다.\n",this.sourceName,use);
	}

	@Override
	void produceEnergy(int time) 
	{
		int energy = time*5;
		this.energyAmount += energy;

		System.out.printf("%s 를 %d 생산했습니다.\n",this.sourceName,energy);
	}
}
