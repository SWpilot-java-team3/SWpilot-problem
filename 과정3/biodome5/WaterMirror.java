package 과정3.biodome5;

public class WaterMirror extends AncientArtifact implements WeatherCotroller, EnergyGenerator{
	int energyAmount;
	public WaterMirror()
	{
		super("물의 거울");
		this.energyAmount = 0;
		System.out.println("물의 거울 유물이 생성되었습니다.");
	}

	@Override
	public void describe() {
		System.out.println("물의 거울 : 수증기를 모아 에너지를 생성하고, 날씨를 조절함(예. 습도에 영향을 받으며, 비와 눈을 내림)");

	}

	@Override
	public void controlWeather() {
		System.out.println("물의 거울을 이용해 눈을 내리도록 했습니다");
	}

	public void generateEnergy(int energy)
	{
		this.energyAmount += energy;
		System.out.println("물의 거울에 " + energy + "만큼 에너지를 충전합니다.");
	}


}
