package biodome4;

public class EnergyManager {
	int allEnergy = 0;
	
	int mergeEnergy(EnergySource kind1,EnergySource kind2,EnergySource kind3)
	{
		allEnergy = kind1.energyAmount + kind2.energyAmount + kind3.energyAmount;
		return allEnergy;
	}
}
