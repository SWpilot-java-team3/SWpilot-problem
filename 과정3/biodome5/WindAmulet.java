package 과정3.biodome5;

public class WindAmulet extends AncientArtifact implements WeatherCotroller{
	public WindAmulet()
	{
		super("바람의 부적");
		System.out.println("바람의 부적 유물을 생성하셨습니다.");
	}

	@Override
	public void describe() {
		System.out.println("주변 공기의 흐름을 이용해 날씨를 조절함(예. 저기압, 고기압, 강풍 등)");
	}

	@Override
	public void controlWeather(){
		System.out.println("바람의 부족을 사용하여 강풍을 일으켰습니다");
	}
}
