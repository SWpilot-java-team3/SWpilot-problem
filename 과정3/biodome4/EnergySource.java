package biodome4;

abstract class EnergySource {
	final String sourceName;
	int energyAmount;
	
	 public EnergySource(String name) 
	 {
	        this.sourceName = name;
	 }
	 
	abstract void useEnergy(int use);
	abstract void produceEnergy(int time);
}
