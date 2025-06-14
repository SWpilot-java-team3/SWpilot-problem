package biodome5;

public class WaterMirror extends AncientArtifact{
	public WaterMirror()
	{
		super("물의 거울");
	}

	@Override
	void describe() {
		System.out.println("물의 거울 : 수증기를 모아 에너지를 생성하고, 날씨를 조절함(예. 습도에 영향을 받으며, 비와 눈을 내림)")
	}
}
