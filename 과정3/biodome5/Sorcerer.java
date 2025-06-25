package 과정3.biodome5;

public class Sorcerer {
    String name;
    AncientArtifact []artifacts = new AncientArtifact[10];
    int artifactNum;

    public Sorcerer(String name)
    {
        this.name = name;
        this.artifactNum = 0;
    }

    public void getArtifact(AncientArtifact artifact){
        System.out.println("미법사 " + name + "이 "+ artifact.name + "을 소유하게 되었습니다");
        artifacts[artifactNum] = artifact;
        artifactNum++;
    }

    public void checkArtifact(AncientArtifact artifact){
        System.out.println("마법사 " + name + "이" + artifact.name+"의 능력을 확입합니다.");
        artifact.describe();
    }

    public void useArtifact(AncientArtifact artifact){
        if(artifact instanceof EnergyGenerator){
            System.out.println("마법사 " + name + "이" + artifact.name+"의 에너지 생성 능력을 사용합니다.");
            int energy = (int) (Math.random()*100 + 1);
            ((EnergyGenerator) artifact).generateEnergy(energy);
        }

        if(artifact instanceof WeatherCotroller){
            System.out.println("마법사 " + name + "이" + artifact.name+"의 날씨 변경 능력을 사용합니다.");
            ((WeatherCotroller) artifact).controlWeather();
        }
    }

}
