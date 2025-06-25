package 과정3.biodome5;

public class BiodomeFamily05 {
    public static void main(String[] args){
        Sorcerer sorcerer = new Sorcerer("아리엘");
        AncientArtifact artifact1 = new SolorStone();
        AncientArtifact artifact2 = new WindAmulet();
        AncientArtifact artifact3 = new WaterMirror();


        sorcerer.getArtifact(artifact1);
        sorcerer.getArtifact(artifact2);
        sorcerer.getArtifact(artifact3);
        System.out.println();

        sorcerer.checkArtifact(artifact1);
        System.out.println();

        sorcerer.useArtifact(artifact1);
        System.out.println();

        sorcerer.useArtifact(artifact2);
        System.out.println();

        sorcerer.useArtifact(artifact3);
    }
}
