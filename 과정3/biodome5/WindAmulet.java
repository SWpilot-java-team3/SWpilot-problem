package biodome5;

public class WindAmulet extends AncientArtifact{
	public WindAmulet()
	{
		super("바람의 부적");
	}

	@Override
	void describe() {
		System.out.println("바람의 부적 : 주변 공기의 흐름을 이용해 날씨를 조절함(예. 저기압, 고기압, 강풍 등)");
	}
}
