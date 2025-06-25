package 과정3.biodome5;

public class SolorStone extends AncientArtifact implements EnergyGenerator{
	int energyAmount;
	public SolorStone()
	{
		super("태양의 돌");
		this.energyAmount = 0;
		System.out.println("태양의 돌 유물이 생성되었습니다.");
	}


	@Override
	public void describe() {
		System.out.println("태양의 돌 : 빛을 받아 에너지 생성(예. 빛을 받은 시간에 영향을 받음)");
	}

	@Override
	public void generateEnergy(int energy)
	{
		this.energyAmount += energy;
		System.out.println("태양의 돌에 " + energy + "만큼 에너지를 충전합니다.");
	}
}
