package biodome5;

abstract class AncientArtifact {
	final String name;
	
	public AncientArtifact(String name)
	{
		this.name = name;
	}
	
	abstract void describe();
}
