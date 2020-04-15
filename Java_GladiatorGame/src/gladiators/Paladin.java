package gladiators;

import java.util.Random;

public class Paladin extends Gladiator {
	
	private int healColdDown = 0;
	
	public Paladin(String name, int attackPower, int blockPower) {
		super(name, attackPower, blockPower);
	}

	@Override
	public void setHealthPoint(int healthPoint) {
		
		/** NewHP < 15? */
		if( (healthPoint < 15) && (this.healColdDown == 0) )
		{
			/** HP = NewHP + BP */
			super.setHealthPoint( healthPoint + this.getBlockPower() );
			
			this.healColdDown = (new Random()).nextInt(10);
		}
		else
		{
			this.healColdDown--;
			super.setHealthPoint(healthPoint);
		}
	}


}
