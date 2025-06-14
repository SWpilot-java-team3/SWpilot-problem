package biodome5;

public class SolorStone extends AncientArtifact {
	public SolorStone()
	{
		super("태양의 돌");
	}

	@Override
	void describe() {
		System.out.println("태양의 돌 : 빛을 받아 에너지 생성(예. 빛을 받은 시간에 영향을 받음)")
	}
}
